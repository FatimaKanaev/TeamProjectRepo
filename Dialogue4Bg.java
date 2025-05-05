import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue3Bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue4Bg extends World
{

    /**
     * Constructor for objects of class Dialogue3Bg.
     * 
     */
    public Dialogue4Bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(747, 431, 1);
        prepare();
    }
    private void prepare()
    {
        int screenWidth = getWidth();      // 747
        int screenHeight = getHeight();    // 431
        int boxHeight = 100;

        addObject(new Dialogue5Mermaid(), screenWidth / 2, screenHeight - boxHeight / 2 -25);
    }
}
