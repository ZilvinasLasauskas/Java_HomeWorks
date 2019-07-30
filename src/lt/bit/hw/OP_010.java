package lt.bit.hw;

//Parašykite programą, kuri užpildo 20 elementų masyvą atsitiktiniais skaičiais.
// Surušiuokite gautą masyvą. suskaičiuokite Masyvo elementų reikšmių sumą.

import java.util.Arrays;

public class OP_010 {
    public static void main(String[] args) {
        int[] randNumbers = new int[20];
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = (int) (Math.random() * 777);
        }
        System.out.println("Array: " + Arrays.toString(randNumbers));
        int sum = 0;
        Arrays.sort(randNumbers);
        for (int i = 0; i < randNumbers.length; i++) {
            sum += randNumbers[i];
        }
        System.out.println("Array, sorted up: " + Arrays.toString(randNumbers));
        System.out.println("Array, sum total: " + sum);
    }
}