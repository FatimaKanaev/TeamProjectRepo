import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Continue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Continue extends Actor
{
    /**
     * Act - do whatever the Continue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage originalImage;
    private GreenfootImage scaledImage;
    private boolean isHovered = false;
    
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
            Greenfoot.setWorld(new WakingUp());
        }
    }
    
    public Continue()
    {
        originalImage = new GreenfootImage("continue.jpg");
        originalImage.scale(215, 85); // Original size
        setImage(originalImage);

        // Create a slightly larger version for hover
        scaledImage = new GreenfootImage("continue.jpg");
        scaledImage.scale(252, 100); // Hover size
    }
}
