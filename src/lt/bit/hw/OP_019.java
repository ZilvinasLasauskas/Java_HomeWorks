package lt.bit.hw;
/*
Parašykite programą, kuri sumuoja dviejų atsitiktinai sugeneruotų masyvų skaičius.
 Sumavimo rezultatas turi būti surašytas į trečią masyvą.
 Masyvai turi būti int tipo.
  */

import java.util.Arrays;

public class OP_019 {
    public static void main(String[] args) {
        int[] ArrayOne = new int[10];
        for (int i = 0; i < ArrayOne.length; i++) {
            ArrayOne[i] = (int) (Math.random() * 1000);
        }
        int[] ArrayTwo = new int[15];
        for (int i = 0; i < ArrayTwo.length; i++) {
            ArrayTwo[i] = (int) (Math.random() * 800);
        }
        int[] ArraySum = new int[5];
        for (int i = 0; i < ArraySum.length; i++) {
            ArraySum[i] = ArrayOne[i] + ArrayTwo[i];
        }
        System.out.println(Arrays.toString(ArrayOne));
        System.out.println(Arrays.toString(ArrayTwo));
        System.out.println(Arrays.toString(ArraySum));
    }
}
