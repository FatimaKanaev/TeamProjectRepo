import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinalBoss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinalBoss extends World
{
    private MainCharacterFinalBoss mainCharacter;
    /**
     * Constructor for objects of class FinalBoss.
     * 
     */
    public FinalBoss()
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
        MainCharacterFinalBoss mainCharacter = new MainCharacterFinalBoss();
        addObject(mainCharacter,671,339);
    }
    
    private void controlCharacterMovement()
    {
        controlCharacterMovement();
        int newY = mainCharacter.getY() - 5;
        if (newY < 305) {
            newY = 305;
        }
        mainCharacter.setLocation(mainCharacter.getX(), newY);
    }
}
