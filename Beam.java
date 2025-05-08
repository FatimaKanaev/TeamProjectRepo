import greenfoot.*;
import java.awt.Point;
import java.util.List;
public class Beam extends Actor
{
    private List<Point> path;
    private int currentTargetIndex = 0;
    private boolean rotationSet = false; // <-- NEW: ensure we set rotation only once
    private static final double TOLERANCE = 15;
    private static int pointsReached = 0; // Track how many points we've reached
    private static final int REQUIRED_POINTS = 5; // A, B, C, D, then back to A = 5 points
    
    public Beam(List<Point> path) {
        this.path = path;
        setImage(makeBeamImage());
    }
    
    public void act() {
        if (!rotationSet) {
            setInitialRotation();
            rotationSet = true;
        }
        
        if (path != null && currentTargetIndex < path.size()) {
            Point target = path.get(currentTargetIndex);
            move(8);
            if (distanceTo(target) < TOLERANCE) {
                currentTargetIndex++;
                pointsReached++; // Increment our counter whenever we reach a point
                
                // If we've reached all points (A→B→C→D→A), change the world
                if (pointsReached >= REQUIRED_POINTS) {
                    Greenfoot.setWorld(new FairyMeeting3());
                    return; // Exit after changing world
                }
                
                if (currentTargetIndex < path.size()) {
                    Beam newBeam = new Beam(path);
                    newBeam.currentTargetIndex = this.currentTargetIndex;
                    getWorld().addObject(newBeam, getX(), getY());
                }
                getWorld().removeObject(this);
            }
        } else if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
    
    private void setInitialRotation() {
        if (path != null && currentTargetIndex < path.size()) {
            Point target = path.get(currentTargetIndex);
            setRotation(angleTo(target));
        }
    }
    
    private int angleTo(Point p) {
        int dx = p.x - getX();
        int dy = p.y - getY();
        double angle = Math.toDegrees(Math.atan2(dy, dx));
        return (int)((angle + 360) % 360);
    }
    
    private double distanceTo(Point p) {
        double dx = p.x - getX();
        double dy = p.y - getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    private GreenfootImage makeBeamImage() {
        GreenfootImage img = new GreenfootImage(35, 3);
        img.setColor(new Color(173, 216, 230, 180));
        img.fillRect(0, 0, 35, 3);
        return img;
    }
}