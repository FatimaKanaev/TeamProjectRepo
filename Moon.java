import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
import java.awt.Point;

public class Moon extends Actor
{
    private boolean beamGenerated = false;
    private List<Point> path = null;

    // Target points
    private Point pointA = new Point(457, 184);
    private Point pointB = new Point(670, 297);
    private Point pointC = new Point(605, 398);
    private Point pointD = new Point(310, 363);

    public Moon()
    {
        path = List.of(pointA, pointB, pointC, pointD, pointA); // Full loop
    }

    public void act()
    {
        if (!beamGenerated) {
            if (areMirrorsCorrectlyPlaced()) {
                // Fire beam along full path A→B→C→D→A
                generateBeamToPointA();
                beamGenerated = true;
                // if(generateBeamToPointA){
                    // generateBeamToPointB();
                    // beamGenerated = true;
                // }
            } else {
                // Keep firing random beams
                generateRandomBeam();
            }
        }
    }

    private void generateBeamToPointA()
    {
        getWorld().addObject(new Beam(path), getX(), getY());
    }
    
    // private void generateBeamToPointB()
    // {
        // getWorld().addObject(new Beam(path), getX(), getY());
    // }

    private void generateRandomBeam()
    {
        if (Greenfoot.getRandomNumber(10) == 0) {
            // Just one dummy point to move forward
            Point randomTarget = new Point(getX() + Greenfoot.getRandomNumber(200) - 100,
                                           getY() + Greenfoot.getRandomNumber(200) - 100);
            List<Point> randomPath = new ArrayList<>();
            randomPath.add(randomTarget);
            getWorld().addObject(new Beam(randomPath), getX(), getY());
        }
    }

    private boolean areMirrorsCorrectlyPlaced()
    {
        return isMirrorNear(pointA) &&
               isMirrorNear(pointB) &&
               isMirrorNear(pointC) &&
               isMirrorNear(pointD);
    }

    private boolean isMirrorNear(Point target)
    {
        List<MirrorLevel1> mirrors = getWorld().getObjects(MirrorLevel1.class);
        for (MirrorLevel1 mirror : mirrors) {
            if (mirror != null && distanceTo(mirror, target) < 15) {
                return true;
            }
        }
        return false;
    }

    private double distanceTo(Actor actor, Point target)
    {
        double dx = target.x - actor.getX();
        double dy = target.y - actor.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}