import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Moon extends Actor
{
    private boolean beamGenerated = false;

    /**
     * 
     */

    /**
     * Act - do whatever the LightSource wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            Beam beam =  new  Beam(getRotation());
            setRotation((getRotation() + 45) % 360);
        }
        if (Greenfoot.getRandomNumber(5) == 0) {
            Beam beam =  new  Beam(getRotation());
            getWorld().addObject(beam, getX(), getY());
        }
        if ( ! beamGenerated) {
            int angle = 45;
            setRotation(angle);
            Beam beam =  new  Beam(angle);
            getWorld().addObject(beam, getX(), getY());
            beamGenerated = true;
        }
    }
}