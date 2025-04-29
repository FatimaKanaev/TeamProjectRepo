import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCharacter extends Actor
{
    /**
     * Act - do whatever the MainCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public MainCharacter()
    {
        setImage("MainCharacterRight.png");
    }

    public void act() 
    {
        if (Greenfoot.isKeyDown("up")) {
            setImage("MainCharacterUp.png");
            moveUp();
        } 
        else if (Greenfoot.isKeyDown("down")) {
            setImage("MainCharacterRight.png");
            moveDown();
        }
        else if (Greenfoot.isKeyDown("left")) {
            setImage("MainCharacterLeft.png");
            move(-2);
        } 
        else if (Greenfoot.isKeyDown("right")) {
            setImage("MainCharacterRight.png");
            move(2);
        } 
        else {
            setImage("MainCharacterRight.png");
        }
    }
    
    private void moveDown() {
        setLocation(getX(), getY() + 5);
    }
    
    private void moveUp() {
        setLocation(getX(), getY() - 5);
    }

}
