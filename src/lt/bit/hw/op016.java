package lt.bit.hw;

//Parašykite programą, kuri skaičiuoja visų lyginių skaičių sumą diapazone nuo 0 iki 1000.
// Turi būti panaudoti for, while ir do ... while ciklai.

public class op016 {
    public static void main(String[] args) {
        int sumOne = 0;
        int sumTwo = 0;
        int sumThree = 0;
        int evenTwo = 0;
        int evenThree = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 2 == 0) {
                sumOne = sumOne + i;
            }
        }
        System.out.println("Sum calculated with 'for' : " + sumOne);
        while (evenTwo <= 1000) {
            sumTwo = sumTwo + evenTwo;
            evenTwo += 2;
        }
        System.out.println("Sum calculated with 'while' : " + sumTwo);
        do {
            if (evenThree % 2 == 0) {
                sumThree += evenThree;
            }
        }
        while ((evenThree += 1) <= 1000);
        System.out.println("Sum calculated with 'do..while' : " + sumThree);
    }
}