package lt.bit.hw;

public class OP_003 {
    public static void main(String[] args) {
        squareCounter();
    }

    private static void squareCounter() {
        double borderA = 10.456;
        double borderB = 6.674;
        double perimeter = 2 * (borderA + borderB);
        double square = borderA * borderB;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Square: " + square);
    }
}