package lt.bit.hw.op026;

public class GeometricFigures {
    int borderA;
    int borderB;
    double bottom;
    double altitude;
    int radius;
    double result;

    public void rectangleArea(int borderA, int borderB) {
        result = borderA * borderB;
        System.out.println("Rectangle area is: " + result);
    }

    public void triangleArea(double bottom, double altitude) {
        result = (bottom * altitude) / 2;
        System.out.println("Triangle area is: " + result);
    }

    public void circleArea(double radius) {
        result = radius * radius * Math.PI;
        System.out.println("Circle area is: " + result);
    }
}
