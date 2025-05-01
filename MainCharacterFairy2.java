import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * MainCharacterFairy2 - handles left/right movement and animation.
 */
public class MainCharacterFairy2 extends Actor
{
    private int animationCounter = 0;
    private int animationFrame = 2;
    private String direction = "left";

    public MainCharacterFairy2()
    {
        setImage("MainCharacterUp.png");
    }

    public void act()
    {
        boolean keyPressed = false;

        if (Greenfoot.isKeyDown("left")) {
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

        // When no key is pressed, return to default "up" image
        if (!keyPressed) {
            setImage("MainCharacterUp.png");
        }
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