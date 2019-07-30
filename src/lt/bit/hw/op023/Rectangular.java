package lt.bit.hw.op023;

import java.util.Scanner;

public class Rectangular {
    Scanner scanner = new Scanner(System.in);
    int borderA;
    int borderB;

    public void readData() {
        System.out.println("Input borderA: ");
        borderA = scanner.nextInt();
        System.out.println("Input borderB: ");
        borderB = scanner.nextInt();
    }

    public int countSquarePerimeter() {
        return  2 * (borderA + borderB);
    }

    public int countSquareArea() {
        return borderA * borderB;
    }

    public void printSquareArea() {
        System.out.println("Rectangular perimeter: " + countSquarePerimeter());
        System.out.println("Rectangular area : " + countSquareArea());
    }
}
