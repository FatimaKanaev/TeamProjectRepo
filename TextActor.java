import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextActor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class TextActor extends Actor {
    public TextActor() {
        GreenfootImage textImage = new GreenfootImage("Press 1, 2, 3, or 4 to play a sound", 24, Color.WHITE, new Color(0, 0, 0, 180));
        setImage(textImage);
    }
}

