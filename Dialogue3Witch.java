import greenfoot.*;

/**
 * Write a description of class Dialogue3Witch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue3Witch extends DialogueBox {
    public Dialogue3Witch(){
   
        lines = new String[]{
            "Excuse me—sorry to bother you—but do you know where I can find the\nprincess? I need to see her.",
            "Oh, of course you do.",
            "...What do you mean by that?",
            "You don’t know? She’s the reason we’re all stuck in this endless night. Got\nherself cursed and decided to drag the entire kingdom down with her. Selfish,\ndon’t you think?",
            "Is that so? I had no idea.",
            "Of course you didn’t! Why are you even trying to see her? She’s probably\nlost her mind by now, clinging to whatever magic keeps us forgotten by time.",
            "Honestly? I don’t know. I just woke up with this letter saying that I have to\nfind her. Maybe I can help somehow.",
            "Hmph… Well now… you must be the one, then.",
            "I really don’t have time for your jokes, I’m very short on it.",
            "Time? Oh sweet child, you’ve got the whole night. Better yet—you’ve got\neternity.",
            "Which could finally change… if you’d just tell me where to find her.",
            "Fine. Here’s the deal: ever since time broke, my powers to shift the tides\nhave been trapped—sealed in those moonpearls you see over there. ",
            "Normally I could command the water with a flick of my hand, but now…",
            "You’ll have to figure out how to get the water levels just right. If you succeed,\na bridge will lead you to the mermaid. She can help you find the princess.",
            "I’ll give you my charm—which I assure you could come in handy if things go\nwrong with her royal highness.",
            "Thanks, I guess. But… you mocked me not so long ago, why would you give\nme your charm and help me all of a sudden?",
            "Well... I’m just bitter I guess. Maybe I’m tired of living the same night for\nwho-knows-how-long. Either way—don’t waste another second. Here’s my\ncharm, now go on!"
        };

        speakers = new String[] {
            "Player", "Witch", "Player", "Witch", "Player", "Witch", "Player", "Witch",
            "Player", "Witch", "Player", "Witch", "Witch", "Witch", "Witch", "Player", "Witch"
        };

        updateDisplay();
    }

    protected String wrapText(String text, int maxWidth, Font font) {
        String[] words = text.split(" ");
        StringBuilder wrapped = new StringBuilder(), line = new StringBuilder();

        for (String word : words) {
            String testLine = line + word + " ";
            GreenfootImage testImg = new GreenfootImage(testLine, font.getSize(), Color.WHITE, null);
            if (testImg.getWidth() > maxWidth) {
                wrapped.append(line).append("\n");
                line = new StringBuilder(word + " ");
            } else {
                line.append(word).append(" ");
            }
        }

        return wrapped.append(line).toString().trim();
    }

    protected void onDialogueEnd() {
        Greenfoot.setWorld(new WitchHouse2());
    }
}
