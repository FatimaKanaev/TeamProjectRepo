import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Fairy1 extends World
{
    private int frameCounter = 0;
    private boolean fairyAdded = false;
    private MainCharacterFairy1 mainCharacter;

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
    }

    private void prepare()
    {
        mainCharacter = new MainCharacterFairy1();
        addObject(mainCharacter, 442, 320);
        MainCharacterFairy1 mainCharacterFairy12 = new MainCharacterFairy1();
        addObject(mainCharacterFairy12,189,211);
    }
}
