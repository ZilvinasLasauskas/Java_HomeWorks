package lt.bit.hw;

public class OP_007 {
    public static void main(String[] args) {
        kmiCounter ();
    }
    private static void kmiCounter() {
        double height = 1.88; // m
        double weight = 88; // kg
        double kmiCounter;
        kmiCounter = weight / (height * height);
        System.out.format("Jei ugis yra: " + height + " m, o mase: " + weight +
                " kg, tai Jusu kmi: %.2f%n", kmiCounter);
    }
}
