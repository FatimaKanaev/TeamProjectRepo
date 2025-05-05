import greenfoot.*;
import java.util.ArrayList;
import java.util.List;

public class MainCharacter extends Actor
{
    private int animationCounter = 0;
    private int animationFrame = 2;
    private String direction = "left";

    public MainCharacter()
    {
        setImage("MainCharacterRight.png");
    }

    public void act() 
    {
        boolean keyPressed = false;
        World currentWorld = getWorld();
        if (Greenfoot.isKeyDown("w")) {
            tryMove(0, -2);
            setImage("MainCharacterUp.png");
            keyPressed = true;
        }
        if (Greenfoot.isKeyDown("s")) {
            tryMove(0, 2);
            setImage("MainCharacterRight.png");
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
        if(isTouching(GoodBernard.class)){
            if(currentWorld instanceof WalkToTheWitch2){
                Greenfoot.setWorld(new WitchHouse());
            }
            if (currentWorld instanceof WalkToMermaid2){
                Greenfoot.setWorld(new MeetMermaid());
            }
            if (currentWorld instanceof FinalBossTraject1){
                Greenfoot.setWorld(new FinalBossWalking2());
            }
            if (currentWorld instanceof FairyMeeting4){
                Greenfoot.setWorld(new WalkToTheWitch1());
            }
        }
        if(isTouching(GoodGérarld.class)){
            if (currentWorld instanceof WalkToTheWitch1){
                Greenfoot.setWorld(new WalkToTheWitch2());
            }
            if (currentWorld instanceof WakingUp){
                Greenfoot.setWorld(new FairyMeeting());
            }
            if (currentWorld instanceof WalkToMermaid1){
                Greenfoot.setWorld(new WalkToMermaid2());
            }
            if (currentWorld instanceof WalkToMermaid2){
                Greenfoot.setWorld(new MeetMermaid());
            }
            if (currentWorld instanceof MeetMermaid3){
                Greenfoot.setWorld(new FinalBossTraject1());
            }
        }
    }
    
    public void tryMove(int dx, int dy) {
        int newX = getX() + dx;
        int newY = getY() + dy;
        setLocation(newX, newY);
        Actor mirror = getOneObjectAtOffset(dx,dy,MirrorLevel1.class);
        if(mirror != null){
            int mirrorNewX = mirror.getX() + dx;
            int mirrorNewY = mirror.getY() + dy;
            double length = Math.sqrt(mirrorNewX * mirrorNewX + mirrorNewY * mirrorNewY);
            List<Actor> obstacles = getWorld().getObjectsAt(mirrorNewX, mirrorNewY, Actor.class);
            boolean blocked = false;
            for (Actor a : obstacles) {
                    if (!(a instanceof MainCharacter) && !(a instanceof MirrorLevel1)) {
                        blocked = true;
                        break;
                    }
            }
        
            if (isTouching(Gérarld.class)) {
                setLocation(getX() - dx, getY() - dy);
            }
            if(isTouching(Bernard.class)){
                setLocation(getX() - dx, getY() - dy);
            }
            if(isTouching(Michel.class)){
                setLocation(getX() - dx, getY() - dy);
            }
            if(isTouching(Fairy.class)){
                setLocation(getX() - dx, getY() - dy);
            }
            return;
        }
        setLocation(newX, newY);
        if (isTouching(Gérarld.class) || isTouching(Bernard.class) || 
            isTouching(Michel.class) || isTouching(Fairy.class)) {
            setLocation(getX() - dx, getY() - dy);
        }
        if (isTouching(Witch.class)){
            setLocation(getX() - dx, getY() - dy);
        }
    }

    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
}





