import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends Actor
{
    private GreenfootImage originalImage;
    private GreenfootImage scaledImage;
    private boolean isHovered = false;
    /**
     * Act - do whatever the Credits wants to do. This method is called whenever
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
            Greenfoot.setWorld(new HelpPage());
        }
    }
    
    public Credits() {
        originalImage = new GreenfootImage("credits.jpg");
        originalImage.scale(500, 300); // Original size
        setImage(originalImage);

        // Create a slightly larger version for hover
        scaledImage = new GreenfootImage("credits.jpg");
        scaledImage.scale(600, 400); // Hover size
    }
}
