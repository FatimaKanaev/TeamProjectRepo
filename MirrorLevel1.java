import greenfoot.*;

/**
 * Mirror class that reflects beams when clicked.
 */
public class MirrorLevel1 extends Actor
{
    // Act method to rotate the mirror when clicked
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            setRotation((getRotation() + 25) % 360);  // Change the rotation by 25 degrees
        }
    }

    // Calculate the reflection angle when a beam hits this mirror
    public int getReflectionAngle(int incomingAngle)
    {
        int currentRotation = getRotation();
        int reflected = (2 * currentRotation - incomingAngle + 180) % 360;
        return reflected;
    }
}
