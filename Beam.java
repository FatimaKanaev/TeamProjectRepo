import greenfoot.*;

public class Beam extends Actor
{
    private boolean hasReflectedOnce = false;  // Flag to track first reflection
    private boolean hasReflectedTwice = false; // Flag to track second reflection
    private static final int BEAM_SPEED = 8;  // Speed of the beam
    private boolean hasTouchedMoon = false;  // Flag to check if the beam touched the Moon after the second reflection

    // Constructor to set the initial angle of the beam
    public Beam(int angle)
    {
        setRotation(angle); // Set the initial direction
        setImage(makeBeamImage()); // Set the beam image
    }

    // Act method - move the beam, reflect off mirrors, and handle world change
    public void act()
    {
        move(BEAM_SPEED); // Move the beam

        // Check for intersection with the first mirror (reflect)
        Actor mirror = getOneIntersectingObject(MirrorLevel1.class);
        if (mirror != null) {
            MirrorLevel1 m = (MirrorLevel1) mirror;
            int newAngle = m.getReflectionAngle(getRotation()); // Get the reflection angle
            getWorld().addObject(new Beam(newAngle), getX(), getY()); // Create a new beam with the reflected angle
            getWorld().removeObject(this); // Remove the current beam
            if (!hasReflectedOnce) {
                hasReflectedOnce = true; // Mark the first reflection
            }
            return;
        }

        // If the beam has reflected once, check for the second reflection (off the second mirror)
        if (hasReflectedOnce && !hasReflectedTwice) {
            mirror = getOneIntersectingObject(MirrorLevel1.class);
            if (mirror != null) {
                MirrorLevel1 m = (MirrorLevel1) mirror;
                int newAngle = m.getReflectionAngle(getRotation()); // Get the reflection angle from the second mirror
                getWorld().addObject(new Beam(newAngle), getX(), getY()); // Create a new beam with the reflected angle
                getWorld().removeObject(this); // Remove the current beam
                hasReflectedTwice = true; // Mark the second reflection
            }
        }

        // After the second reflection, check if the beam is directed towards the Moon
        if (hasReflectedTwice) {
            Actor moon = getOneIntersectingObject(Moon.class);
            if (moon != null && !hasTouchedMoon) {
                hasTouchedMoon = true; // Prevent multiple world changes
                System.out.println("Beam has touched the Moon after two reflections. Changing the world...");
                Greenfoot.setWorld(new FairyMeeting3()); // Change the world
                Greenfoot.stop(); // Stop further actions to ensure no multiple world changes
            }
        }

        // Remove the beam if it reaches the edge of the world
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }

    // Create a simple beam image
    private GreenfootImage makeBeamImage()
    {
        GreenfootImage img = new GreenfootImage(35, 3);
        img.setColor(new Color(173, 216, 230, 180)); // Light blue color for the beam
        img.fillRect(0, 0, 35, 3);
        return img;
    }
}
