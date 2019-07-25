package lt.bit.hw;
/*
Parašykite programą, kuri pašalina dublikatus (pasikartojančias reikšmes) iš int tipo masyvo.
Masyvą sugeneruoti naudojant Random klasę.
  */

import java.util.Arrays;

public class op021 {
    public static void main(String[] args) {
        int[] arrayInit = new int[50];
        for (int i = 0; i < arrayInit.length; i++) {
            arrayInit[i] = (int) (Math.random() * 30);
        }

        Arrays.sort(arrayInit);
        int n = 1;
        for (int i = 1; i < arrayInit.length; i++) {
            if (arrayInit[i] != arrayInit[i - 1])
                n++;
        }

        int[] arrayResult = new int[n];
        arrayResult[0] = arrayInit[0];
        n = 1;
        for (int i = 1; i < arrayInit.length; i++) {
            if (arrayInit[i] != arrayInit[i - 1])
                arrayResult[n++] = arrayInit[i];
        }
        System.out.println(Arrays.toString(arrayInit));
        System.out.println(Arrays.toString(arrayResult));
    }
}