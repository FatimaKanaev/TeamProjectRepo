import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShellPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShellPlay extends World
{

    /**
     * Constructor for objects of class ShellPlay.
     * 
     */
    public ShellPlay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(747, 431, 1); 
        prepare();
        TextActor textActor = new TextActor();
        addObject(textActor, 150, 50);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
    }

}
