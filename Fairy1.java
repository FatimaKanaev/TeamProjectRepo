import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fairy1 extends World
{
    private int frameCounter = 0;
    private boolean fairyAdded = false;
    private MainCharacter mainCharacter;

    public Fairy1()
    {    
        super(747, 431, 1);
        prepare();
    }

    public void act()
    {
        frameCounter++;
        if (frameCounter == 200 && !fairyAdded) {
            Fairy fairy = new Fairy();
            addObject(fairy, 220, 130);
            fairyAdded = true;
        }
        controlCharacterMovement();
    }

    private void prepare()
    {
        mainCharacter = new MainCharacter();
        addObject(mainCharacter, 442, 320);
    }

    private void controlCharacterMovement()
    {
        int newY = mainCharacter.getY() - 5;
        if (newY < 174) {
            newY = 174;
        }
        mainCharacter.setLocation(mainCharacter.getX(), newY);
    }
}
