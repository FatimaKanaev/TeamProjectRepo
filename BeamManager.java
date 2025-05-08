import greenfoot.*;
import java.awt.Point;
import java.util.*;

public class BeamManager extends Actor
{
    private List<Point> expectedPath = Arrays.asList(
        new Point(457, 184), // A
        new Point(670, 297), // B
        new Point(605, 398), // C
        new Point(310, 363), // D
        new Point(457, 184)  // A again
    );

    private int currentStep = 0;

    public void registerHit(int x, int y)
    {
        if (currentStep >= expectedPath.size()) return;

        Point hitPoint = new Point(x, y);
        Point expected = expectedPath.get(currentStep);

        if (hitPoint.distance(expected) < 15) { // Allow slight margin
            currentStep++;
            if (currentStep == expectedPath.size()) {
                Greenfoot.setWorld(new FairyMeeting3());
            }
        } else {
            currentStep = 0; // reset if path breaks
        }
    }
}
