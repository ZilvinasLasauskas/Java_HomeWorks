package lt.bit.hw;

public class OP_004 {
    public static void main(String[] args) {
        piCounter ();
    }
    private static void piCounter() {
        double pi = Math.PI;
        System.out.println("The system value of pi is: " + pi);
        System.out.format("The value of pi (5 places after decimal point) is: %.5f%n", pi);
    }
}
