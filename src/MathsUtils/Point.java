package MathsUtils;

import java.awt.geom.Arc2D;

/**
 * Created by Here on 2/4/2017.
 */
public class Point {
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + Double.toString(x) + "," + Double.toString(y) + ")";
    }

}
