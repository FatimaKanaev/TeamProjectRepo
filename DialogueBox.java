import greenfoot.*;

public class DialogueBox extends Actor {
    protected String[] lines;
    private int currentLine = 0;
    private GreenfootImage boxImage;
    private boolean ePressedLastTime = false;
    protected String[] speakers; 
    private String currentText = "";
    private int textIndex = 0;
    private int frameDelay = 2; // number of act() calls to wait between each letter
    private int frameCount = 0;
    private boolean fullLineDisplayed = false;

    public DialogueBox() {
        lines = new String[] {"[default line]"};
        speakers = new String[]{""};
    }

    public void act() {
    if (!fullLineDisplayed) {
        frameCount++;
        if (frameCount >= frameDelay) {
            frameCount = 0;
            textIndex++;
            if (textIndex <= lines[currentLine].length()) {
                updateDisplayText();
            } else {
                fullLineDisplayed = true;
            }
        }
    } else {
        if (Greenfoot.isKeyDown("e") && !ePressedLastTime) {
            currentLine++;
            if (currentLine < lines.length) {
                startNewLine();
            } else {
                onDialogueEnd();
            }
            ePressedLastTime = true;
        }
        if (!Greenfoot.isKeyDown("e")) {
            ePressedLastTime = false;
        }
    }
}

private void updateDisplayText() {
    Font font = new Font("Arial", true, false, 18);

    boxImage = new GreenfootImage(700, 120); // your box size
    boxImage.setColor(new Color(0, 0, 0, 180));
    boxImage.fillRect(0, 0, 700, 120);
    boxImage.setColor(Color.WHITE);
    boxImage.setFont(font);

    String speakerText = (currentLine < speakers.length) ? speakers[currentLine] : "";
    if (!speakerText.equals("")) {
        boxImage.drawString(speakerText + ":", 20, 25);
    }

    String visibleText = lines[currentLine].substring(0, Math.min(textIndex, lines[currentLine].length()));
    String wrapped = wrapText(visibleText, 660, font);

    int y = 50;
    for (String line : wrapped.split("\n")) {
        boxImage.drawString(line, 20, y);
        y += 20;
    }

    setImage(boxImage);
}

private void startNewLine() {
    currentText = "";
    textIndex = 0;
    fullLineDisplayed = false;
    frameCount = 0;
}


    protected String wrapText(String text, int maxWidth, Font font) {
        String[] words = text.split(" ");
        StringBuilder wrapped = new StringBuilder();
        StringBuilder line = new StringBuilder();

        for (String word : words) {
            String testLine = line + word + " ";
            GreenfootImage testImg = new GreenfootImage(testLine, font.getSize(), Color.WHITE, new Color(0, 0, 0, 0));
        
            if (testImg.getWidth() > maxWidth) {
                wrapped.append(line).append("\n");
                line = new StringBuilder(word + " ");
            } else {
                line.append(word).append(" ");
            }
        }

        wrapped.append(line); // Final line
        return wrapped.toString().trim();
    }
    protected void displayLine() {
        Font font = new Font("Arial", true, false, 18);

        // Box sets
        boxImage = new GreenfootImage(700, 120); // make taller if needed
        boxImage.setColor(new Color(0, 0, 0, 180));
        boxImage.fillRect(0, 0, 700, 120);
        boxImage.setColor(Color.WHITE);
        boxImage.setFont(font);

        String fullText = lines[currentLine];
        String speakerText = (currentLine < speakers.length) ? speakers[currentLine] : "";
        String wrapped = wrapText(fullText, 660, font); // wraps to 660px inside 700px box

        int y = 45; 

    
        if (!speakerText.equals("")) {
            boxImage.drawString(speakerText + ":", 20, 25);
        }

    
        String[] wrappedLines = wrapped.split("\n");
        for (String line : wrappedLines) {
            boxImage.drawString(line, 20, y);
            y += 20; 
        }

        setImage(boxImage);
    }

    protected void onDialogueEnd() {
        getWorld().removeObject(this);
    }
}
