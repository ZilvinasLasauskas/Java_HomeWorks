package lt.bit.hw.op029;

import java.util.Scanner;

public class Equation {
    Scanner input = new Scanner(System.in);
    double a, b, c;
    double discriminant;
    double x1, x2;

    public void readData() {
        System.out.println("Enter the coefficients of quadratic equation (ax2 + bx + c = 0)");
        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        System.out.print("Input c: ");
        double c = input.nextDouble();
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = (b * b) - (4 * a * c);
    }

    public void calculate() {
        if (this.discriminant > 0) {
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are x1 = " + x1 + " , x2 = " + x2);
        } else if (this.discriminant == 0) {
            x1 = (-b / (2 * a));
            System.out.println("The root is x = " + x1);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }
}


