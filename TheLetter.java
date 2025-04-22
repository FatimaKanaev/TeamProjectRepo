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
        addObject(letter1,522,240);
        letter1.setLocation(552,242);
        letter1.setLocation(465,199);
        letter1.setLocation(574,199);
        letter1.setLocation(412,227);
        letter1.setLocation(370,163);
        letter1.setLocation(467,221);
        letter1.setLocation(470,295);
        letter1.setLocation(488,218);
        letter1.setLocation(324,251);
        letter1.setLocation(638,182);
        letter1.setLocation(483,226);
        letter1.setLocation(506,211);
        letter1.setLocation(456,302);
        letter1.setLocation(476,211);
        letter1.setLocation(481,223);
        letter1.setLocation(532,196);
        letter1.setLocation(459,236);
        letter1.setLocation(488,212);
    }
}
