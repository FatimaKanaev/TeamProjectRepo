import greenfoot.*;

public class MainCharacterWitch1 extends Actor
{
    private int animationCounter = 0;
    private int animationFrame = 2;
    private String direction = "left";

    public MainCharacterWitch1()
    {
        setImage("MainCharacterLeft.png");
    }

    public void act() 
    {
        boolean keyPressed = false;

        if (Greenfoot.isKeyDown("up")) {
            direction = "up";
            moveIfNoCollision(0, -5);
            setImage("MainCharacterUp.png");
            keyPressed = true;
        } 
        else if (Greenfoot.isKeyDown("down")) {
            direction = "down";
            moveIfNoCollision(0, 5);
            setImage("MainCharacterRight.png");
            keyPressed = true;
        }
        else if (Greenfoot.isKeyDown("left")) {
            direction = "left";
            moveIfNoCollision(-5, 0);
            animateLeftWalk();
            keyPressed = true;
        }
        else if (Greenfoot.isKeyDown("right")) {
            direction = "right";
            moveIfNoCollision(5, 0);
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

    // Move only if the next location does not intersect a Witch
    private void moveIfNoCollision(int dx, int dy) {
        int newX = getX() + dx;
        int newY = getY() + dy;
        setLocation(newX, newY);
        Actor witch = getOneIntersectingObject(Witch.class); // Check for collision
        if (witch != null) {
            setLocation(getX() - dx, getY() - dy); // Undo move if collided
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
