import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dialogue1Fairy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue2Fairy extends DialogueBox
{
    protected String wrapText(String text, int maxWidth, Font font){
        String[] words = text.split("");
        StringBuilder wrapped = new StringBuilder();
        StringBuilder line = new StringBuilder();
        
        for (String word : words){
            String testLine = line + word + "";
            GreenfootImage testImg = new GreenfootImage(testLine.toString(), font.getSize(), Color.WHITE, new Color(0,0,0,0));
            
            if (testImg.getWidth()>maxWidth){
                wrapped.append(line).append("\n");
                line = new StringBuilder(word+ "");
            } else {
                line.append(word).append("");
            }
        }
        wrapped.append(line);
        return wrapped.toString().trim();
    }
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
        
        speakers = new String[]{
            "Fairy",
            "Fairy",
            "Fairy",
            "Fairy",
            "Fairy",
            "Fairy",
            "Player",
        };
        displayLine();
    }
    
    protected void onDialogueEnd(){
        Greenfoot.setWorld(new FairyMeeting2());
    }
}