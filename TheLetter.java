import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Starting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TheLetter extends World
{

    /**
     * Constructor for objects of class Starting.
     * 
     */
    public TheLetter()
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
        Letter1 letter1 = new Letter1();
        addObject(letter1,488,212);
        Click click = new Click();
        addObject(click,477,217);
    }
}
