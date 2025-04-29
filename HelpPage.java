import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpPage extends World
{
    /**
     * Constructor for objects of class FinalBoss.
     * 
     */
    public HelpPage()
    {    
        super(747, 431, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        HelpPageGif helpPageGif = new HelpPageGif();
        addObject(helpPageGif,364,209);
        helpPageGif.setLocation(377,215);
        Console console = new Console();
        addObject(console,50,50);
        helpPageGif.setLocation(377,216);
    }
}
