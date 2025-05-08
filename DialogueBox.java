import greenfoot.*;

public class DialogueBox extends Actor {
    protected String[] lines = {"[default line]"};
    protected String[] speakers = {""};
    private int currentLine = 0, textIndex = 0, frameCount = 0;
    private boolean skipPressed = false;

    public void act() {
        if (currentLine >= lines.length) return;

        if (Greenfoot.isKeyDown("space") && !skipPressed) {
            skipPressed = true;
            if (textIndex < lines[currentLine].length()) {
                textIndex = lines[currentLine].length();
                updateDisplay();
            } else {
                currentLine++;
                if (currentLine < lines.length) {
                    textIndex = 0;
                } else {
                    onDialogueEnd();
                }
            }
        } else if (!Greenfoot.isKeyDown("space")) {
            skipPressed = false;
        }

        if (textIndex < lines[currentLine].length()) {
            if (++frameCount >= 2) {
                frameCount = 0;
                textIndex++;
                updateDisplay();
            }
        }
    }

    protected void updateDisplay() {
        GreenfootImage img = new GreenfootImage(700, 120);
        img.setColor(new Color(0, 0, 0, 180));
        img.fillRect(0, 0, 700, 120);
        img.setColor(Color.WHITE);
        img.setFont(new Font("Arial", true, false, 18));
        img.drawString(lines[currentLine].substring(0, textIndex), 20, 45);
        setImage(img);
    }

    protected void onDialogueEnd() {
        getWorld().removeObject(this);
    }
}
