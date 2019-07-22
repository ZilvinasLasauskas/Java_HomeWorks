package lt.bit.hw;

public class op006 {
    public static void main(String[] args) {
        degreeConverter ();
    }
    private static void degreeConverter() {
        int tFarenheit = 191;
        double tCelsius = (tFarenheit - 32) / 1.8;
        System.out.format("Kai temp. F = " + tFarenheit +", temp. C yra: %.2f%n", tCelsius);
    }
}
