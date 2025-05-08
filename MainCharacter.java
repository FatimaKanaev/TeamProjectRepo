import greenfoot.*;
import java.util.List;

public class MainCharacter extends Actor {
    private int animationCounter = 0;
    private int animationFrame = 2;
    private String direction = "left";

    public MainCharacter() {
        setImage("MainCharacterRight.png");
    }

    public void act() {
        boolean keyPressed = false;
        World currentWorld = getWorld();

        // Handle movement
        if (Greenfoot.isKeyDown("w")) {
            tryMove(0, -2);
            setImage("MainCharacterUp.png");
            direction = "up";
            keyPressed = true;
        }
        if (Greenfoot.isKeyDown("s")) {
            tryMove(0, 2);
            setImage("MainCharacterRight.png");
            direction = "down";
            keyPressed = true;
        }
        if (Greenfoot.isKeyDown("a")) {
            tryMove(-2, 0);
            animationCounter++;
            if (animationCounter % 5 == 0) {
                animationFrame++;
                if (animationFrame > 3) animationFrame = 2;
                setImage("MainCharacterLeft" + animationFrame + ".png");
            }
            direction = "left";
            keyPressed = true;
        }
        if (Greenfoot.isKeyDown("d")) {
            tryMove(2, 0);
            animationCounter++;
            if (animationCounter % 5 == 0) {
                animationFrame++;
                if (animationFrame > 3) animationFrame = 2;
                setImage("MainCharacterRight" + animationFrame + ".png");
            }
            direction = "right";
            keyPressed = true;
        }

        // If no key is pressed, set the default standing image based on direction
        if (!keyPressed) {
            if (direction.equals("right") || direction.equals("left")) {
                setImage("MainCharacter" + direction.substring(0, 1).toUpperCase() + direction.substring(1) + ".png");
            } 
            else {
                setImage("MainCharacterRight.png");
            }
        }

        // Check for collisions with specific actors and change world accordingly
        if (isTouching(GoodBernard.class)) {
            if (currentWorld instanceof WalkToTheWitch2) {
                Greenfoot.setWorld(new WitchHouse());
            }
            if (currentWorld instanceof WalkToMermaid2) {
                Greenfoot.setWorld(new MeetMermaid());
            }
            if (currentWorld instanceof FinalBossTraject1) {
                Greenfoot.setWorld(new FinalBossWalking2());
            }
            if (currentWorld instanceof FairyMeeting4) {
                Greenfoot.setWorld(new WalkToTheWitch1());
            }
        }

        if (isTouching(GoodGérarld.class)) {
            if (currentWorld instanceof WalkToTheWitch1) {
                Greenfoot.setWorld(new WalkToTheWitch2());
            }
            if (currentWorld instanceof WakingUp) {
                Greenfoot.setWorld(new FairyMeeting());
            }
            if (currentWorld instanceof WalkToMermaid1) {
                Greenfoot.setWorld(new WalkToMermaid2());
            }
            if (currentWorld instanceof WalkToMermaid2) {
                Greenfoot.setWorld(new MeetMermaid());
            }
            if (currentWorld instanceof MeetMermaid3) {
                Greenfoot.setWorld(new FinalBossTraject1());
            }
        }
    }

    // Attempt to move the character and any interacting mirrors
    public void tryMove(int dx, int dy) {
        int newX = getX() + dx;
        int newY = getY() + dy;
        setLocation(newX, newY);

        // Check if the MainCharacter is touching a MirrorLevel1
        Actor mirror = getOneObjectAtOffset(dx, dy, MirrorLevel1.class);
        if (mirror != null) {
            // Try to move the mirror in the same direction
            int mirrorNewX = mirror.getX() + dx;
            int mirrorNewY = mirror.getY() + dy;

            // Check for obstacles in front of the mirror
            List<Actor> obstacles = getWorld().getObjectsAt(mirrorNewX, mirrorNewY, Actor.class);
            boolean blocked = false;
            for (Actor a : obstacles) {
                if (!(a instanceof MainCharacter) && !(a instanceof MirrorLevel1)) {
                    blocked = true;
                    break;
                }
            }

            // Move the mirror if not blocked, else stop moving the character
            if (!blocked) {
                mirror.setLocation(mirrorNewX, mirrorNewY);
            } else {
                setLocation(getX() - dx, getY() - dy);
            }
        }

        // Prevent movement if touching other obstacles
        if (isTouching(Gérarld.class) || isTouching(Bernard.class) || 
            isTouching(Michel.class) || isTouching(Fairy.class) || isTouching(Witch.class)) {
            setLocation(getX() - dx, getY() - dy);
        }
    }
}
