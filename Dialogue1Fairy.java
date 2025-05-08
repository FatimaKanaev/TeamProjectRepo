import greenfoot.*;

/**
 * Write a description of class Dialogue1Fairy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dialogue1Fairy extends DialogueBox {
    public Dialogue1Fairy() {
        lines = new String[] {
            "Oh! Well, hello there! Are you alright? You look... rather lost.",
            "I guess I am. I just woke up in the middle of nowhere, and I can’t\nremember how I got here… or much of anything, really.",
            "How unfortunate! Poor thing. Is there something I can do to help?",
            "Actually... I have this letter. It’s addressed to the princess of this\nkingdom. Do you know where I might find her?",
            "The princess? Of course I know where she is—who doesn’t? But I’m\nafraid I can’t just point you there for free... I’ve got a little trouble of my own.",
            "Maybe I could help?",
            "Oh, how lovely of you to offer! Since your memory’s a bit foggy,\nlet me explain: we’re all caught in a strange loop—this very night keeps\nrepeating itself.",
            "The moon has been full for... well, forever now. No one really knows\nwhy.",
            "I've been trying to make the most of it by gardening my moonshaded\nroses, but the light beam in my home refuses to shine where I need it to.",
            "I’ll do what I can to help—if you promise to help me find the princess\nafterward.",
            "What a delightful little traveler you are! Very well. If you manage to fix\nthe beam, I’ll give you my moonlight prism.",
            "Trust me, you will certainly need it at the end of your journey.",
            "Come along now, don’t be shy.",
        };

        speakers = new String[] {
            "Fairy", "Player", "Fairy", "Player", "Fairy", "Player", "Fairy",
            "Fairy", "Fairy", "Player", "Fairy", "Fairy", "Fairy"
        };

        updateDisplay();
    }

    protected String wrapText(String text, int maxWidth, Font font) {
        String[] words = text.split(" ");
        StringBuilder wrapped = new StringBuilder(), line = new StringBuilder();

        for (String word : words) {
            String test = line + word + " ";
            GreenfootImage testImg = new GreenfootImage(test, font.getSize(), Color.WHITE, null);
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
        Greenfoot.setWorld(new FairyMeeting2());
    }
}
