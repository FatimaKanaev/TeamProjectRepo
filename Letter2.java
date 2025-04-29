import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Letter2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letter2 extends Actor
{
    /**
     * Act - do whatever the Letter2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 0;
    public void act() {
        timer++;
        if (timer == 300) { // 5 seconds at 60 FPS
            World world = getWorld();
            int x = 747 - 90;
            int y = 431 - 30;
            world.addObject(new Continue(), x, y);
        }
    }
}
