package lt.bit.hw.op028;

/* Naudojant klasę Random parašykite programą, kuri sukuria objektą Random tipo
su pradiniu skaičiumi 1000 ir naudojant metodą nextInt sugeneruoja 50 atsitiktinių skaičių nuo 0 iki 100.
 */

import java.util.Arrays;
import java.util.Random;

public class OP_028 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[50];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);

        }System.out.println(Arrays.toString(arr));
    }
}

