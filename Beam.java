import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Beam extends Actor {
    private int reflectionCount = 0; // Tracks how many times the beam has reflected
    private boolean hasTouchedMoon = false;
    private static final int BEAM_SPEED = 8;

    // Constructor for original beam
    public Beam(int angle) {
        this(angle, 0); // Start with 0 reflections
    }

    // Constructor for reflected beams
    public Beam(int angle, int reflectionCount) {
        setRotation(angle);
        this.reflectionCount = reflectionCount;
        setImage(makeBeamImage());
    }

    public void act() {
        move(BEAM_SPEED);

        // Remove the beam if it reaches the edge of the world
        if (isAtEdge()) {
            getWorld().removeObject(this);
            return;
        }

        // Check for reflection
        Actor mirror = getOneIntersectingObject(MirrorLevel1.class);
        if (mirror != null && reflectionCount < 2) {
            MirrorLevel1 m = (MirrorLevel1) mirror;
            int newAngle = m.getReflectionAngle(getRotation());

            // Debug output
            System.out.println("Reflection " + (reflectionCount + 1) + " at (" + getX() + "," + getY() + "), new angle: " + newAngle);

            // Spawn new reflected beam with incremented reflection count
            getWorld().addObject(new Beam(newAngle, reflectionCount + 1), getX(), getY());

            // Remove current beam
            getWorld().removeObject(this);
            return;
        }

        // After exactly 2 reflections, check if beam touches the Moon
        if (reflectionCount == 2 && !hasTouchedMoon) {
            Actor moon = getOneIntersectingObject(Moon.class);
            if (moon != null) {
                hasTouchedMoon = true; // prevent multiple triggers
                System.out.println("Beam has touched the Moon after two reflections. Changing the world...");
                Greenfoot.setWorld(new FairyMeeting3()); 
                Greenfoot.stop(); // Optional: stop the game if needed
            }
        }
    }

    // Create a simple beam image
    private GreenfootImage makeBeamImage() {
        GreenfootImage img = new GreenfootImage(35, 3);
        img.setColor(new Color(173, 216, 230, 180)); // Light blue
        img.fillRect(0, 0, 35, 3);
        return img;
    }
}