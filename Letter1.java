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
        int x = 500;
        int y = 225;
        world.addObject(new Letter2(), x, y);
        world.removeObject(this);
        clicked = true;
        letter2Added = true;
        }

        // Timer logic runs AFTER click, continuously in each act
        if (letter2Added && timer < 300) {
            timer++;
        }

        // After 5 seconds (300 acts), add Continue
        if (letter2Added && timer == 300) {
            World world = getWorld();
            int x2 = 650;
            int y2 = 400;
            world.addObject(new Continue(), x2, y2);

            // Prevent adding it again
            letter2Added = false;
        }
    }
}
