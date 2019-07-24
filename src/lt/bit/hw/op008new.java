package lt.bit.hw;

import java.util.Scanner;

public class op008new {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;
        System.out.println("Input first number a: ");
        a = input.nextInt();
        System.out.println("Input second number b: ");
        b = input.nextInt();
        System.out.println("Input operation");
        System.out.println("Possible options: Math:  + , - , / , * , % " + "\n" +
                " Logic:  == , > , < , != , >= , <= " + "\n" +
                " Bitwise:  | , & , ^");
        String c = input.next();

        float sum = a + b;
        float diff = a - b;
        float div = a / b;
        float mult = a * b;
        float rem = a % b;

        switch (c) {
            case ("+"):
                System.out.println("Sum: " + sum);
                break;
            case ("-"):
                System.out.println("Subtraction: " + diff);
                break;
            case ("/"):
                System.out.println("Division: " + div);
                break;
            case ("*"):
                System.out.println("Multplication: " + mult);
                break;
            case ("%"):
                System.out.println("Remainder: " + rem);
                break;
            case ("=="):
                System.out.println("Equal?: a == b is " + (a == b));
                break;
            case (">"):
                System.out.println("More?: a > b is " + (a > b));
                break;
            case ("<"):
                System.out.println("Less?: a < b is " + (a < b));
                break;
            case ("!="):
                System.out.println("Not equal?: a != b is " + (a != b));
                break;
            case (">="):
                System.out.println("More or equal?: b >= a is " + (b >= a));
                break;
            case ("<="):
                System.out.println("Less or equal?: b <= a is " + (b <= a));
                break;
            case ("&"):
                System.out.printf("Bitwise AND: a & b = %d%n", (a & b));
                break;
            case ("|"):
                System.out.println("Bitwise OR: a | b = " + (a | b));
                break;
            case ("^"):
                System.out.println("Bitwise XOR: a ^ b = " + (a ^ b));
                break;

        }
    }
}