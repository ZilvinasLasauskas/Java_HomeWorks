package lt.bit.hw;

//Parašykite Fibonačio skaičių sekos skaičiavimo programą, kuri nenaudoja rekursijos.

import java.math.BigDecimal;

public class OP_014 {
    public static void main(String args[]) {
        BigDecimal n1 = BigDecimal.valueOf(0);
        BigDecimal n2 = BigDecimal.valueOf(1);
//            BigDecimal n3;
        int count = 100;
        System.out.print(n1 + " " + n2); //printing 0 and 1

        for (int i = 2; i < count; ++i) {
            BigDecimal n3 = n1.add(n2);
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
