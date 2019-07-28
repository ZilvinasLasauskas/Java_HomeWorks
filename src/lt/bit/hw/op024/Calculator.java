package lt.bit.hw.op024;

import java.util.Scanner;

public class Calculator {

    Scanner scanner = new Scanner(System.in);
    float a;
    float b;
    String oper;
    float result;

    public void inputNumbers() {
        System.out.println("Input first number a: ");
        a = scanner.nextInt();
        System.out.println("Input second number b: ");
        b = scanner.nextInt();
    }

    public void inputOperation() {
        System.out.println("Input operation");
        System.out.println("Possible options: Math:  + , - , / , * , % ");
        String oper = scanner.next();

        switch (oper) {
            case ("+"):
                result = Float.valueOf(a + b);
                System.out.println("Sum: " + result);
                break;
            case ("-"):
                result = Float.valueOf(a - b);
                System.out.println("Subtraction: " + result);
                break;
            case ("/"):
                result = Float.valueOf(a / b);
                System.out.println("Division: " + result);
                break;
            case ("*"):
                result = Float.valueOf(a * b);
                System.out.println("Multplication: " + result);
                break;
            case ("%"):
                result = Float.valueOf(a % b);
                System.out.println("Remainder: " + result);
                break;
            default:
                System.out.println("Wrong symbol of operation ...");
        }
    }
}
