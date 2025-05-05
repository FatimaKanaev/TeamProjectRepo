import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Quentin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quentin extends Actor
{
    private EIcon icon;
    private boolean iconVisible = false;
    private boolean ePressedLastTime = false;
    private int triggerDistance = 100;

    public Quentin()
    {
        GreenfootImage img = new GreenfootImage(2, 2);
        img.setColor((new Color(255, 255, 255, 10)));
        img.fillRect(0, 0, 100, 1);
        setImage(img);
    }
    /**
     * Act - do whatever the Quentin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        List<MainCharacter> players = getWorld().getObjects(MainCharacter.class);
        if (players.size() == 0) 
        return;
        MainCharacter player = players.get(0);

        int distance = (int)Math.hypot(player.getX() - getX(), player.getY() - getY());
        if (getWorld() instanceof FairyMeeting2)
            if (distance <= triggerDistance) {
                if (!iconVisible) {
                    icon = new EIcon();
                    getWorld().addObject(icon, getX(), getY());
                    iconVisible = true;
                }

                if (Greenfoot.isKeyDown("e") && !ePressedLastTime) {
                    Greenfoot.setWorld(new FairyRoom());
                }
            } else {
                if (iconVisible) {
                    getWorld().removeObject(icon);
                    iconVisible = false;
                }
            }
        int distanceMeetM2 = 20;
        if (getWorld() instanceof WitchHouse2)
            
            if (distanceMeetM2 <= triggerDistance) {
                if (!iconVisible) {
                    icon = new EIcon();
                    getWorld().addObject(icon, getX(), getY());
                    iconVisible = true;
                }

                if (Greenfoot.isKeyDown("e") && !ePressedLastTime) {
                    Greenfoot.setWorld(new PearlGame());
                }
            } else {
                if (iconVisible) {
                    getWorld().removeObject(icon);
                    iconVisible = false;
                }
            }
        if (getWorld() instanceof MeetMermaid2)
            if (distance <= triggerDistance) {
                if (!iconVisible) {
                    icon = new EIcon();
                    getWorld().addObject(icon, getX(), getY());
                    iconVisible = true;
                }

                if (Greenfoot.isKeyDown("e") && !ePressedLastTime) {
                    Greenfoot.setWorld(new ShellPlay());
                }
            } else {
                if (iconVisible) {
                    getWorld().removeObject(icon);
                    iconVisible = false;
                }
            }
    }
}
