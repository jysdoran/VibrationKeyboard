package MathsUtils;

/**
 * Created by Here on 2/4/2017.
 * This class contains utility functions that calculate the point where the sound
 * of the key press emanated from.
 * Ideally all functions in this class will take inputs that have distance in cm,
 * velocity in cm per second, and time in seconds.
 */
public class Utilsa1a2a3 {
    //Returns the coordinate that the perpendicular line for the line d12 eminates from.
    public static Point CalcD12PerpCoord(double D12, double velocity,
                                         double t2) {
        return new Point((D12 + velocity * t2)/2, 0);
    }
    //Returns the coordinate that the perpendicular line for the line d23 emanates from
    public static Point CalcD23PerpCoord(double D23, double velocity,
                                         double t3, double t2,
                                         double k, double l) {
        double d = ((D23 - velocity*(t3 - t2))*k);
        return new Point(d * (k/D23), d * (l/D23));
    }
    //Returns the coordinte where the sound emanated from relative to the bottom left node.
    public static Point calcKeyCoord(double D23, double D12,
                                 double velocity, double t3,
                                 double t2, double k, double l) {
        Point d12PerpCoord = CalcD12PerpCoord(D12, velocity, t2);
        Point d23PerpCoord = CalcD23PerpCoord(D23, velocity, t3, t2, k, l);
        return new Point(d12PerpCoord.getX(), d23PerpCoord.getY()
                + (k/l)*(d23PerpCoord.getX() - (D12 + velocity * t2)/2));
    }
    //Returns the coordinate where the sound emanated from relative to the bottom left key on the keyboard.
    public static Point calcRelativeKeyCoord(double D23, double D12,
                                             double velocity, double t3,
                                             double t2, double k, double l,
                                             double distanceToBottomLeftKey) {
        Point keyCoord = calcKeyCoord(D23, D12, velocity, t3, t2, k, l);
        return new Point(keyCoord.getX(), keyCoord.getY() - distanceToBottomLeftKey);
    }
}
