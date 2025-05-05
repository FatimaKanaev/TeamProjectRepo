import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue1Bg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue1Bg extends World
{

    /**
     * Constructor for objects of class Dialogue1Bg.
     * 
     */
    public Dialogue1Bg()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(747, 431, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        int screenWidth = getWidth();      // 747
        int screenHeight = getHeight();    // 431
        int boxHeight = 100;

        addObject(new Dialogue1Fairy(), screenWidth / 2, screenHeight - boxHeight / 2 -25);
    }
}
