import greenfoot.*;  // Import Greenfoot classes

/**
 * Write a description of class Shell1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shell1 extends Actor {
    public void act() {
        
        if (Greenfoot.isKeyDown("1")) {
            // Play the sound 
            Greenfoot.playSound("sound1.wav");  
        }
    }
}
