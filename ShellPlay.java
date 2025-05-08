import greenfoot.*;  // Import Greenfoot classes

public class ShellPlay extends World {
    private int[] correctOrder = {1, 2, 3, 4};  // The correct order of clicks
    private int[] playerClicks = new int[4];    // To store player's clicks
    private int currentIndex = 0;                // To track current click

    public ShellPlay() {    
        super(600, 400, 1);  // Create a world with a width of 600 and height of 400 pixels
        BackgroundMusicController.stopBackgroundMusic();
        // Add the shells to the world
        addObject(new Shell1(), 80, 200);  // Position Shell 1
        addObject(new Shell2(), 250, 200);  // Position Shell 2
        addObject(new Shell3(), 410, 200);  // Position Shell 3
        addObject(new Shell4(), 700, 200);  // Position Shell 4

        // Display a brief instruction
        showText("Click the shells in the correct order!", 300, 50);
        prepare();
    }

    // This method is called when a shell is clicked
    public void shellClicked(int shellNumber) {
        playerClicks[currentIndex] = shellNumber;  // Store the player's click

        // Check if the click is correct
        if (playerClicks[currentIndex] == correctOrder[currentIndex]) {
            currentIndex++;  // Move to the next index
            if (currentIndex == 4) {
                puzzleSolved(); 
            }
        } else {
            resetPuzzle();  // Reset the puzzle if the wrong shell is clicked
        }
    }

    // Called when the puzzle is solved
    private void puzzleSolved() {
        showText("Congratulations! Puzzle solved!", 300, 50);  // Display a congratulatory message
        Greenfoot.delay(100);  // Delay to let the player see the message
        Greenfoot.setWorld(new MeetMermaid3());  // Transition to another world (optional)
    }

    // Called if the player clicks the wrong shell
    private void resetPuzzle() {
        currentIndex = 0;
        for (int i = 0; i < playerClicks.length; i++) {
            playerClicks[i] = 0;  // Reset the clicks
        }
        showText("Wrong sequence! Try again.", 300, 50);  // Show a message
        Greenfoot.delay(50);  // Delay for a moment
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
