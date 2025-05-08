import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EIcon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EIcon extends Actor
{
    public void act()
    {
        GreenfootImage img = getImage();

    for (int x = 0; x < img.getWidth(); x++) {
        for (int y = 0; y < img.getHeight(); y++) {
            Color pixelColor = img.getColorAt(x, y);
            if (pixelColor.getRed() < 10 && pixelColor.getGreen() < 10 && pixelColor.getBlue() < 10) {
                img.setColorAt(x, y, Color.WHITE); 
            }
        }
    }
    }
}
