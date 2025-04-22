import greenfoot.*;

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Actor
{
    private GreenfootImage originalImage;
    private GreenfootImage scaledImage;
    private boolean isHovered = false;
    
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseMoved(this) && !isHovered) {
            setImage(scaledImage);
            isHovered = true;
        } else if (Greenfoot.mouseMoved(null) && isHovered) {
            setImage(originalImage);
            isHovered = false;
        }

        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Intro());
        }
    }
    
    public Play() {
        originalImage = new GreenfootImage("Play.jpg");
        originalImage.scale(60, 30); // Original size
        setImage(originalImage);

        // Create a slightly larger version for hover
        scaledImage = new GreenfootImage("Play.jpg");
        scaledImage.scale(90, 60); // Hover size
    }
}

