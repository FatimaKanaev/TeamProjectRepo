import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shell2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shell2 extends Actor
{
    /**
     * Act - do whatever the Shell2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        
        if (Greenfoot.isKeyDown("2")) {
            // Play the sound 
            Greenfoot.playSound("sound2.wav");  
        }
    }
}
