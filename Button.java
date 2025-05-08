import greenfoot.*;

public class Button extends Actor {
    private String label;

    public Button(String label) {
        this.label = label;
        updateImage();
    }

    private void updateImage() {
        GreenfootImage image = new GreenfootImage(200, 50);
        image.setColor(Color.BLUE);
        image.fill();
        image.setColor(Color.WHITE);
        image.setFont(new Font("Arial", true, false, 20));
        image.drawString(label, 50, 30);
        setImage(image);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            onClick();
        }
    }

    private void onClick() {
        Greenfoot.setWorld(new WelcomeWorld()); 
    }
}
