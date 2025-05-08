import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shell4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shell4 extends Actor
{
    /**
     * Act - do whatever the Shell4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        
        if (Greenfoot.isKeyDown("4")) {
            // Play the sound
            Greenfoot.playSound("sound4.wav");  
        }
    }
}
