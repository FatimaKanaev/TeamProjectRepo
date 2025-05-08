import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shell3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shell3 extends Actor
{
    /**
     * Act - do whatever the Shell3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        
        if (Greenfoot.isKeyDown("3")) {
            // Play the sound
            Greenfoot.playSound("sound3.wav");  
        }
    }
}
