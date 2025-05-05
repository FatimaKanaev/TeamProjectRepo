import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MirrorLevel1 extends Actor
{
    private Actor MirrorLevel1;

    /**
     * Act - do whatever the mirror wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            setRotation((getRotation() + 45) % 360);
        }
    }

    /**
     * 
     */
    public int getReflectionAngle(int incomingAngle)
    {
        int currentRotation = getRotation();
        int reflected = (2 * currentRotation - incomingAngle + 360) % 360;
        return reflected;
    }

    /**
     * 
     */
    public void moveInDirection(int dx, int dy)
    {
        int newX = getX() + dx;
        int newY = getY() + dy;
        if (newX >= 0 && newX < getWorld().getWidth() && newY >= 0 && newY < getWorld().getHeight()) {
            setLocation(newX, newY);
        }
    }

    private void checkBounce() {
<<<<<<< HEAD
        if (isTouching(Gérarld.class)) {
            // Basic bounce: reverse direction
            dx = -dx * 0.7; // recoil, maybe weaker
            dy = -dy * 0.7;

            // Move it slightly back so it unsticks
            setLocation((int)(getX() + dx), (int)(getY() + dy));
        }
        if (isTouching(Bernard.class)) {
            // Basic bounce: reverse direction
            dx = -dx * 0.7; // recoil, maybe weaker
            dy = -dy * 0.7;

            // Move it slightly back so it unsticks
            setLocation((int)(getX() + dx), (int)(getY() + dy));
        }
=======
        // if (isTouching(Gérarld.class)) {
            // // Basic bounce: reverse direction
            // dx = -dx * 0.7; // recoil, maybe weaker
            // dy = -dy * 0.7;

            // // Move it slightly back so it unsticks
            // setLocation((int)(getX() + dx), (int)(getY() + dy));
        // }
        // if (isTouching(Bernard.class)) {
            // // Basic bounce: reverse direction
            // dx = -dx * 0.7; // recoil, maybe weaker
            // dy = -dy * 0.7;

            // // Move it slightly back so it unsticks
            // setLocation((int)(getX() + dx), (int)(getY() + dy));
        // }
>>>>>>> 7737e13e8b6395a01c236cc69da955d38c006376
    }
}