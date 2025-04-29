import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Console here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Console extends Actor
{
    /**
     * Act - do whatever the Console wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage image1;
    private GreenfootImage image2;
    private int frameCounter = 0;
    private int seconds = 60;
    private boolean showingFirst = true;
    
    public Console() {
        image1 = new GreenfootImage("Console1.jpg");
        image2 = new GreenfootImage("Console2.jpg");
        setImage(image1);
    }
    
    public void act()
    {
        frameCounter++;
        if (frameCounter >= seconds) {
            frameCounter = 0;
            if (showingFirst) {
                setImage(image2);
                setLocation(45, 48);
            } else {
                setImage(image1);
            }
            showingFirst = !showingFirst;
        }
        
    }
}
