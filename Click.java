import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letter1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Click extends Actor
{
    GreenfootImage clickImage1;
    GreenfootImage clickImage2;
    private int timer = 0;
    private boolean clicked = false;
    private boolean letter2Added = false;
    public Click() {
        clickImage1 = new GreenfootImage("Click1.jpg");
        clickImage2 = new GreenfootImage("Click2.jpg");
        setImage(clickImage1);
    }
    
    public void act()
    {
        timer++;
        if (timer >= 60)
        {
            if (getImage() == clickImage1) 
            {
                setImage(clickImage2);
            }
            else 
            {
                setImage(clickImage1);
            }
            timer = 0;
        }
        
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
    }
}
