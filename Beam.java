import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Beam extends Actor
{
    private boolean hasReflected = false;

    /**
     * 
     */
    public Beam(int angle)
    {
        setRotation(angle);
        setImage(makeBeamImage());
    }

    /**
     * Act - do whatever the Beam wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(8);
        Actor mirror = getOneIntersectingObject(MirrorLevel1.class);
        if (mirror != null) {
            MirrorLevel1 m = (MirrorLevel1)mirror;
            int newAngle = m.getReflectionAngle(getRotation());
            getWorld().addObject( new  Beam(newAngle), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        if (mirror != null &&  ! hasReflected) {
            hasReflected = true;
            int newAngle = ((MirrorLevel1)mirror).getReflectionAngle(getRotation());
            getWorld().addObject( new  Beam(newAngle), getX(), getY());
            getWorld().removeObject(this);
            return;
        }
        if (isAtEdge()) {
            getWorld().removeObject(this);
            return;
        }
    }

    /**
     * 
     */
    private GreenfootImage makeBeamImage()
    {
        GreenfootImage img =  new  GreenfootImage(35, 3);
        img.setColor( new  Color(173, 216, 230, 180));
        img.fillRect(0, 0, 35, 3);
        return img;
    }
}