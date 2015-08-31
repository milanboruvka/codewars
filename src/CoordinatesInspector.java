import java.awt.geom.Point2D;

public class CoordinatesInspector {

    public Point2D coordinates(Double degrees, Double radius) {

        double radians = Math.toRadians(degrees);
        double x = radius * Math.cos(radians);
        double y = radius * Math.sin(radians);
        x = Math.round(x*10000000000D)/10000000000D;
        y = Math.round(y*10000000000D)/10000000000D;
        return new Point2D.Double(x,y);
    }

}