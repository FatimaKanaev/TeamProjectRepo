import greenfoot.*;

public class WinWorld extends World {
    private GreenfootImage background;
    private GreenfootSound winSound;

    public WinWorld() {
        super(747, 431, 1);

        // Stop background music from previous worlds
        BackgroundMusicController.stopBackgroundMusic();

        // Start the winning sound
        winSound = new GreenfootSound("winning.wav");
        winSound.playLoop();

        // Set up the background
        background = new GreenfootImage(747, 431);
        background.setColor(new Color(0, 0, 0, 180)); // Semi-transparent overlay
        background.fill();
        setBackground(background);

        // Display congratulatory message
        displayMessage();

        // Add a button to go back to the menu (WelcomeWorld)
        Button restartButton = new Button("Go to Menu");
        addObject(restartButton, getWidth() / 2, getHeight() - 100); // Centered at the bottom
    }

    private void displayMessage() {
        // Create an image for the message
        GreenfootImage textImage = new GreenfootImage(700, 100);
        textImage.setColor(Color.WHITE);
        textImage.setFont(new Font("Arial", true, false, 30));
        textImage.drawString("Good job! You've finished all the puzzles!", 50, 50);

        // Create a message label and add it to the world
        Actor messageLabel = new Actor() {
            public void act() {
                // You can add additional functionality here if needed
            }
        };
        messageLabel.setImage(textImage);
        addObject(messageLabel, getWidth() / 2, getHeight() / 2); // Center the message
    }

    // When the world is stopped, ensure the winning sound stops
    public void stopped() {
        if (winSound != null) {
            winSound.stop();
        }
    }
}
