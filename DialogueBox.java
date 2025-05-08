import greenfoot.*;

/**
 * DialogueBox class to manage the display of dialogue lines and speakers.
 */
public class DialogueBox extends Actor {
    protected String[] lines = { 
        "The witch said you know where the princess is. I need you to tell me.", 
        "Not so fast. You’ll need my Celestial Pearl before you face her.", 
        "Alright… what can I do to earn it?", 
        "Time isn’t just looping. It’s forgetting us. This kingdom is slowly fading—\npiece by piece. Until this kingdom is no more.",
        "My loved one, they’re nearly gone. All that’s left of them are their voices,\nechoing inside these shells.",
        "Even the Celestial Pearl is dimming. And once it fades completely... there's\nno bringing it back.",
        "That’s awful… all this just because the heir didn’t want to be cursed?", 
        "...The heir got cursed? Right. It is so well placed coming from you.",
        "I mean— how do you know that I don’t even remember who I am. Am I being\nforgotten too?",
        "That’s not what I meant… you do not remember anything? That is strange…\nbut no. You’re not like the rest.",
        "How can you be so sure?", 
        "We’re running out of time. Help me—let their voices be heard again, just for a\nmoment. It will breathe life back into the Pearl, just long enough for you to\ntake it.",
        "Why do I even need this artifact?", 
        "You ask too many questions. Listen to the shells. Let their voices fill the\nsilence. Only then can you resist the pull of forgetfulness… and finish what\nyou came here to do."
    }; 
    protected String[] speakers = {
        "Player", "Mermaid", "Player", "Mermaid", "Mermaid", "Mermaid", "Player", "Mermaid",
        "Player", "Mermaid", "Player", "Mermaid", "Player", "Mermaid"
    };

    private int currentLine = 0, textIndex = 0, frameCount = 0;
    private boolean skipPressed = false;

    public void act() {
        // Ensure that we don't go beyond the last line
        if (currentLine >= lines.length) {
            return;
        }

        // Handle spacebar press and update dialogue
        if (Greenfoot.isKeyDown("space") && !skipPressed) {
            skipPressed = true;

            // Skip current line if it's already fully displayed
            if (textIndex < lines[currentLine].length()) {
                textIndex = lines[currentLine].length();  // Display all the text at once
                updateDisplay();  // Immediately update the display
            } else {
                currentLine++;  // Move to the next line

                // Ensure we're within bounds
                if (currentLine >= lines.length) {
                    onDialogueEnd();  // If we've reached the end of the dialogue, trigger the world change
                    return;
                }

                textIndex = 0;  // Start from the beginning of the new line
            }
        } else if (!Greenfoot.isKeyDown("space")) {
            skipPressed = false;  // Reset skip flag when space is released
        }

        // Display text one character at a time
        if (textIndex < lines[currentLine].length()) {
            if (++frameCount >= 2) {  // Slow down the character display speed
                frameCount = 0;
                textIndex++;  // Show one more character
                updateDisplay();  // Update the displayed text
            }
        }
    }

    /**
     * Updates the displayed text in the dialogue box.
     */
    protected void updateDisplay() {
        GreenfootImage img = new GreenfootImage(700, 120);  // Create a new image for the dialogue box
        img.setColor(new Color(0, 0, 0, 180));  // Set background color with transparency
        img.fillRect(0, 0, 700, 120);  // Fill the background with color
        img.setColor(Color.WHITE);  // Set text color to white
        img.setFont(new Font("Arial", true, false, 18));  // Set font and size

        // Ensure we don't try to access an invalid index in the 'lines' array
        if (currentLine < lines.length) {
            img.drawString(lines[currentLine].substring(0, textIndex), 20, 45);  // Draw the text
        }

        setImage(img);  // Set the image for the DialogueBox
    }

    /**
     * This method is triggered when the dialogue reaches the end.
     * It changes the world to the next one.
     */
    protected void onDialogueEnd() {
        // Change world to 'MeetMermaid2' (or any other world)
        Greenfoot.setWorld(new MeetMermaid2());  // Replace with your desired world transition
        getWorld().removeObject(this);  // Remove the dialogue box object from the world
    }
}
