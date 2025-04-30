import greenfoot.*;  

/**
 * Write a description of class MainCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MainCharacter extends Actor
{
    private int animationCounter = 0;
    private int animationFrame = 2;
    private String direction = "left";
    
    public MainCharacter()
    {
        setImage("MainCharacterLeft.png");
    }

    public void act() 
    {
        boolean keyPressed = false;

        if (Greenfoot.isKeyDown("up")) {
            direction = "up";
            moveUp();
            setImage("MainCharacterUp.png");
            keyPressed = true;
        } 
        else if (Greenfoot.isKeyDown("down")) {
            direction = "down";
            moveDown();
            setImage("MainCharacterRight.png");
            keyPressed = true;
        }
        else if (Greenfoot.isKeyDown("left")) {
            direction = "left";
            move(-5);
            animateLeftWalk();
            keyPressed = true;
        }
        else if (Greenfoot.isKeyDown("right")) {
            direction = "right";
            move(5);
            animateRightWalk();
            keyPressed = true;
        }

        if (!keyPressed) {
            if (direction.equals("right") || direction.equals("left")) {
                setImage("MainCharacter" + capitalize(direction) + ".png");
            } 
            else {
                setImage("MainCharacterRight.png");
            }
        }
    }

    private void moveDown() {
        setLocation(getX(), getY() + 5);
    }

    private void moveUp() {
        setLocation(getX(), getY() - 5);
    }
    
    private void animateRightWalk() {
        animationCounter++;
        if (animationCounter % 5 == 0) {
            animationFrame++;
            if (animationFrame > 3) animationFrame = 2;
            setImage("MainCharacterRight" + animationFrame + ".png");
        }
     }

    private void animateLeftWalk() {
        animationCounter++;
        if (animationCounter % 5 == 0) {
            animationFrame++;
            if (animationFrame > 3) animationFrame = 2;
            setImage("MainCharacterLeft" + animationFrame + ".png");
        }
    }

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

} 