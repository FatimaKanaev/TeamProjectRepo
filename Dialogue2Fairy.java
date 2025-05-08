import greenfoot.*;

/**
 * Write a description of class Dialogue2Fairy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue2Fairy extends DialogueBox {
     public Dialogue2Fairy(){
        
        lines = new String[]{
            "Oh my stars! You did it—you’ve lit up all my moonroses! Now I can keep\nproducing fairy dust! I truly can’t thank you enough, dear one.",
            "Here--take this prism, just as I promised.",
            "You were already on the right path to find the princess.",
            "Keep heading that way, and ask the next kind soul you meet. They’re sure to\nguide you.",
            "Or… who knows?",
            "Perhaps your memories will return soon, and with them, something that will\nlead you straight to her.",
            "Thank you, truly."
        };

        speakers = new String[] {
            "Fairy", "Fairy", "Fairy", "Fairy", "Fairy", "Fairy", "Player"
        };

        updateDisplay();
    }

    protected String wrapText(String text, int maxWidth, Font font) {
        // Split the input text into an array of words using a space as the delimiter
        String[] words = text.split(" ");   
        // Create a StringBuilder for the wrapped text (final result) and one for the current line being constructed
        StringBuilder wrapped = new StringBuilder(), line = new StringBuilder();

        // Iterate through each word in the text
        for (String word : words) {
            // Test the current line + the next word to see if it fits within the maxWidth
            String testLine = line + word + " ";
            // Create a GreenfootImage of the test line with the provided font to check the width of the text
            GreenfootImage testImg = new GreenfootImage(testLine, font.getSize(), Color.WHITE, null);
        
            // If the test line width exceeds the maxWidth, we start a new line
            if (testImg.getWidth() > maxWidth) {
                // Append the current line to the wrapped text and add a newline
                wrapped.append(line).append("\n");
                // Start a new line with the current word
                line = new StringBuilder(word + " ");
            } else {
                // If the test line fits, add the word to the current line
                line.append(word).append(" ");
            }
        }

        // After the loop, append any remaining text in the current line to the wrapped text
        return wrapped.append(line).toString().trim();
    }


    protected void onDialogueEnd() {
        Greenfoot.setWorld(new FairyMeeting2());
    }
}
