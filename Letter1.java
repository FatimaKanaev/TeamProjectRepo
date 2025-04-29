import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter1 extends Actor
{
    private boolean clicked = false;
    private int timer = 0;
    private boolean letter2Added = false;

    public void act()
    {
        if (Greenfoot.mouseClicked(this) && !clicked) {
            World world = getWorld();
            
            // Removing Click object
            Click click = (Click) world.getObjects(Click.class).get(0);
            if (click != null) {
                world.removeObject(click);
            }
            
            // Removing Letter1 and add Letter2
            int x = 500;
            int y = 225;
            world.addObject(new Letter2(), x, y);
            world.removeObject(this);
            
            clicked = true;
            letter2Added = true;
        }

        if (letter2Added && timer < 300) {
            timer++;
        }

        if (letter2Added && timer == 300) {
            World world = getWorld();
            int x2 = 650;
            int y2 = 400;
            world.addObject(new Continue(), x2, y2);

            letter2Added = false;
        }
    }
}
