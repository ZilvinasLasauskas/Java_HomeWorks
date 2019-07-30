package lt.bit.hw;

//Parašykite programą, kuri atspausdina pateiktą lentelę.
// Užduoties sprendimui galite naudoti sąlyginius sakinius ir ciklus.

import java.util.Arrays;

public class OP_011 {
    public static void main(String[] args) {
        int[][] table = new int[10][10];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == j) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(table[i]));
        }
    }
}
