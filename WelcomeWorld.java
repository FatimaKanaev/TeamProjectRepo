import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class WelcomeWorld extends World
{
    public WelcomeWorld() {
        super(750, 431, 1);
        addObject(new AnimatedGifWelcome(), 430, 240);
        Credits credits = new Credits();
        addObject(credits,45,417);
        Help help = new Help();
        addObject(help,387,418);
        Quit quit = new Quit();
        addObject(quit,726,418);
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Title title = new Title();
        addObject(title,342,202);
        Play play = new Play();
        addObject(play,55,245);
    }
}
