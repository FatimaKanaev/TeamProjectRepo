import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fairy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fairy2 extends World
{

    /**
     * Constructor for objects of class Fairy2.
     * 
     */
    public Fairy2()
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
        MainCharacterFairy2 mainCharacterFairy2 = new MainCharacterFairy2();
        addObject(mainCharacterFairy2,373,382);
        Fairy fairy = new Fairy();
        addObject(fairy,68,131);
    }
}
