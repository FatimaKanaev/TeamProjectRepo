import greenfoot.*;

public class MirrorLevel1 extends Actor
{
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            setRotation((getRotation() + 45) % 360);
        }
    }

    public int getReflectionAngle(int incomingAngle)
    {
        int currentRotation = getRotation();
        return (2 * currentRotation - incomingAngle + 360) % 360;
    }

    public void moveInDirection(int dx, int dy)
    {
        int newX = getX() + dx;
        int newY = getY() + dy;
        if (newX >= 0 && newX < getWorld().getWidth() && newY >= 0 && newY < getWorld().getHeight()) {
            setLocation(newX, newY);
        }
    }
}
