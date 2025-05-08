import greenfoot.*;

/**
 * Write a description of class Dialogue5Mermaid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue5Mermaid extends DialogueBox {

    protected String wrapText(String text, int maxWidth, Font font) {
        String[] words = text.split(" ");
        StringBuilder wrapped = new StringBuilder();
        StringBuilder line = new StringBuilder();

        for (String word : words) {
            String testLine = line + word + " ";
            GreenfootImage testImg = new GreenfootImage(testLine, font.getSize(), Color.WHITE, new Color(0, 0, 0, 0));

            if (testImg.getWidth() > maxWidth) {
                wrapped.append(line).append("\n");
                line.setLength(0);  // Clear the line
            }
            line.append(word).append(" ");
        }
        wrapped.append(line);
        return wrapped.toString().trim();
    }

    public Dialogue5Mermaid(){
   
        lines = new String[]{
            "Good! You’ve succeeded! Don’t waste any more time, the princess is this way, you’ll understand everything once there, don’t you worry!",
            "Here’s the celestial pearl. Time may be broken, but it’s still running out!"
        };
        speakers = new String[] { "Mermaid", "Mermaid" };
        updateDisplay();
    }

    protected void onDialogueEnd() {
        Greenfoot.setWorld(new MeetMermaid4());
    }
}
