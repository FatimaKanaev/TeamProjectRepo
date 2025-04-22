import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AnimatedGIFWelcome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnimatedGifWelcome extends Actor {
    private GreenfootImage[] frames;
    private int currentFrame = 0;
    private int delayCounter = 0;
    private int frameDelay = 5;
    
    public AnimatedGifWelcome() {
        int totalFrames = 121;
        frames = new GreenfootImage[totalFrames];
        for (int i = 0; i < totalFrames; i++) {
            frames[i] = new GreenfootImage((i + 1) + ".gif");
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
