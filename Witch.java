import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Fairy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class  Witch extends Actor {
    private EIcon icon;
    private boolean iconVisible = false;
    private boolean ePressedLastTime = false;
    private int triggerDistance = 120;

    public void act() {
        List<MainCharacter> players = getWorld().getObjects(MainCharacter.class);
        if (players.size() == 0) {
            return;
        }
        MainCharacter player = players.get(0);

        int distance = (int)Math.hypot(player.getX() - getX(), player.getY() - getY());
        if (getWorld() instanceof WitchHouse){
            if (distance <= triggerDistance) {
                if (!iconVisible) {
                    icon = new EIcon();
                    getWorld().addObject(icon, getX(), getY() - 70); // Adjust Y to show icon above
                    iconVisible = true;
                }

                if (Greenfoot.isKeyDown("e") && !ePressedLastTime) {
                    Greenfoot.setWorld(new Dialogue2Bg());
                }
            } else {
                if (iconVisible) {
                    getWorld().removeObject(icon);
                    iconVisible = false;
                }
            }
        }
            

        ePressedLastTime = Greenfoot.isKeyDown("e");
    }
}
   