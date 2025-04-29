import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpPageGif here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpPageGif extends Actor
{
    private GreenfootImage[] frames;
    private int currentFrame = 0;
    private int delayCounter = 0;
    private int frameDelay = 5;

    public HelpPageGif() {
        int totalFrames = 240;
        frames = new GreenfootImage[totalFrames];
        for (int i = 0; i < totalFrames; i++) {
            String filename = "HelpFrames (" + (i + 1) + ").jpg";
            frames[i] = new GreenfootImage(filename);
            frames[i].scale(747, 431);
        }
        setImage(frames[0]);
    }

    public void act() {
        delayCounter++;
        if (delayCounter >= frameDelay) {
            delayCounter = 0;
            currentFrame = (currentFrame + 1) % frames.length;
            setImage(frames[currentFrame]);
        }
    }
}
