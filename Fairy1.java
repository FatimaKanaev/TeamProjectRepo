import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fairy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fairy1 extends World
{
    private int frameCounter = 0;
    private boolean fairyAdded = false;

    public Fairy1()
    {    
        super(747, 431, 1);
        prepare();
    }

    public void act()
    {
        frameCounter++;

        if (frameCounter == 200 && !fairyAdded) {
            Fairy fairy = new Fairy(); // Make sure the Fairy class is defined correctly
            addObject(fairy, 140, 190); // Adjust position as needed
            fairyAdded = true;
        }
    }

    private void prepare()
    {
        MainCharacter mainCharacter = new MainCharacter();
        addObject(mainCharacter, 442, 320);
    }
}
