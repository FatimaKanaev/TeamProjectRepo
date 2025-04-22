import greenfoot.*;
import lang.stride.*;
import java.util.*;

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{
    private long startTime;
    /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
    {    
        super(747, 431, 1);
        prepare();
        startTime = System.currentTimeMillis(); // record the time this world was created
    }
    
    private void prepare()
    {
        String starting = new String();
        StartingGif startingGif = new StartingGif();
        addObject(startingGif,545,269);
    }
    
    public void act() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - startTime >= 4500) { // 4 seconds = 4000 milliseconds
            Greenfoot.setWorld(new TheLetter());
        }
    }
}

