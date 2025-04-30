import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Witch1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Witch1 extends World
{

    /**
     * Constructor for objects of class Witch1.
     * 
     */
    public Witch1()
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

        MainCharacterWitch1 mainCharacterWitch1 = new MainCharacterWitch1();
        addObject(mainCharacterWitch1,684,359);
        Witch witch = new Witch();
        addObject(witch,110,342);
    }
}
