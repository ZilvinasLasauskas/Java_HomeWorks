package lt.bit.hw;

import java.util.Scanner;

public class op009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Staciakampio perimetras ir plotas
        System.out.println("Input borderA: ");
        double borderA = input.nextDouble();
        System.out.println("Input borderB: ");
        double borderB = input.nextDouble();

        double perimeter = 2 * (borderA + borderB);
        double square = borderA * borderB;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Square: " + square);
        System.out.println("----------------------------");

        // Pi
        String pi;
        System.out.println("Input 'pi': ");
        pi = input.next();
        Double PI = Math.PI;
        if (pi.equals("pi")) {
        System.out.println("The system value of pi is: " + PI);
        System.out.format("The value of pi (5 places after decimal point) is: %.5f%n", PI);
        }
        System.out.println("----------------------------");

        // Farenheit -- Celsium converter
        int tFarenheit;
        System.out.println("Iveskite temperatura Farenheit skaleje: ");
        tFarenheit = input.nextInt();
        double tCelsius = (tFarenheit - 32) / 1.8;
        System.out.format("Temperatura C skaleje yra: %.2f%n", tCelsius);
        System.out.println("----------------------------");

        // kmi skaiciuotuvas
        double height, weight;
        System.out.println("Iveskite savo ugi, cm: ");
        height = input.nextDouble();
        System.out.println("Iveskite savo kuno mase, kg: ");
        weight = input.nextDouble();
        Double kmiCounter = weight / ((height * height) / 10000);
        System.out.format("Jusu kmi: %.2f%n", kmiCounter);
        System.out.println("----------------------------");

        // Kalkuliatorius
        System.out.println("Calculator starts:");

        int a, b;
        System.out.println("Input number: ");
        a = input.nextInt();
        System.out.println("Input next number: ");
        b = input.nextInt();
        System.out.println("Input operation");
        String c = input.next();
        int sum = a + b;
        int diff = a - b;
        int div = a / b;
        int mult = a * b;
        int rem = a % b;
        if (c.equals("+")) {
            System.out.println("Skaiciu suma: " + sum);
        }
        if (c.equals("-")) {
            System.out.println("Skaiciu skrtumas: " + diff);
        }
        if (c.equals("/")) {
            System.out.println("Skaiciu dalyba: " + div);
        }
        if (c.equals("*")) {
            System.out.println("Skaiciu daugyba: " + mult);
        }
        if (c.equals("%")) {
            System.out.println("Skaiciu dalyba su liekana: " + rem);
        }
    }
}