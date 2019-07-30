package lt.bit.hw;

//Parašykite faktorialo skaičiavimo programą, kuri nenaudoja rekursijos.

import java.math.BigDecimal;

public class OP_013 {
    public static void main(String args[]) {
        int i = 1;
        BigDecimal fact = BigDecimal.valueOf(1);
        int index = 50;
        for (i = 1; i <= index; i++) {
            fact = fact.multiply(new BigDecimal(i));
        }
        System.out.println("Factorial of " + index + " is: " + fact);
    }
}
