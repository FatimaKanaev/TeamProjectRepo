import greenfoot.*;

public class WelcomeWorld extends World {

    public WelcomeWorld() {
        super(750, 431, 1); 
        
        // Start background music
        BackgroundMusicController.startBackgroundMusic();
        
        // Add objects to the world (e.g., an animated GIF and help buttons)
        addObject(new AnimatedGifWelcome(), 430, 240);
        Help help = new Help();
        addObject(help, 387, 418);
        Quit quit = new Quit();
        addObject(quit, 726, 418);
        
        prepare();
    }
    
    private void prepare() {
        // Setup title and play button
        Title title = new Title();
        addObject(title, 342, 202);
        Play play = new Play();
        addObject(play, 55, 245);
    }
    
    // Ensure music stops when transitioning
    public void stopped() {
        BackgroundMusicController.stopBackgroundMusic();
    }
}
