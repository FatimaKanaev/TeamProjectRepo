import greenfoot.*;

public class BackgroundMusicController {
    
    private static GreenfootSound bgMusic = new GreenfootSound("bg.wav");
    private static boolean isPlaying = false;
    
    // Start playing the background music
    public static void startBackgroundMusic() {
        if (!isPlaying) {
            bgMusic.playLoop();
            isPlaying = true;
        }
    }
    
    // Stop the background music
    public static void stopBackgroundMusic() {
        if (isPlaying) {
            bgMusic.stop();
            isPlaying = false;
        }
    }
    
    // Pause the background music
    public static void pauseBackgroundMusic() {
        if (isPlaying) {
            bgMusic.pause();
        }
    }
    
    // Resume the background music
    public static void resumeBackgroundMusic() {
        if (!isPlaying) {
            bgMusic.playLoop();
            isPlaying = true;
        }
    }
}
