package MathsUtils;

/**
 * Created by Here on 2/4/2017.
 */
public class Utilsa1a2a3 {

    public static Point CalcD12PerpCoord(double D12, double velocity, double t2) {
        return new Point((D12 + velocity * t2)/2, 0);
    }
}
