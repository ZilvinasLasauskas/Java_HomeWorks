package lt.bit.hw;

public class OP_005 {
    public static void main(String[] args) {
        weightCounter ();
    }
    private static void weightCounter() {
        double gEarth = 9.81;
        float gMoon = (float) 1.62;
        double gMercury = 3.70;
        double gMars = 3.86;
        double gUranus = 7.51;
        double gNeptun = 11;
        double gJupiter = 23.95;

        double mEarth = 88.9;

        double forceWeightEarth = mEarth * gEarth;
        System.out.format("Svorio jega Zemeje : %.2f%n", forceWeightEarth);

        float forceWeightMoon = (float) (mEarth * gMoon);
        System.out.println("Svorio jega Menulyje = " + forceWeightMoon);
        double forceWeightMercury = mEarth * gMercury;
        System.out.println("Svorio jega Mercury = " + forceWeightMercury);
        double forceWeightMars = mEarth * gMars;
        System.out.println("Svorio jega Mars = " + forceWeightMars);
        double forceWeightUranus = mEarth * gUranus;
        System.out.println("Svorio jega Uranus = " + forceWeightUranus);
        double forceWeightNeptun = mEarth * gNeptun;
        System.out.format("Svorio jega Neptun = %.2f%n", forceWeightNeptun);
        float forceWeightJupiter = (float) (mEarth * gJupiter);
        System.out.println("Svorio jega Jupiter = " + forceWeightJupiter);
    }
}
