package lt.bit.hw;

public class op008 {

        public static void main(String[] args) {
            simpleCalculator ();
        }

        private static void simpleCalculator() {
            int a = 19;
            int b = 28;
//        simple arithmetics
            int sum = a + b;
            System.out.println("Sum: " + sum);
            int diff = a - b;
            System.out.println("Subtraction: " + diff);
            int mult = a * b;
            System.out.println("Multiplication: " + mult);
            int div = a / b;
            System.out.println("Division: " + div);
            int rem = a % b;
            System.out.println("Remainder: " + rem);
            int inc = a++ + ++b;
            System.out.println("Increment: " + inc);

//            logical operations
            System.out.println("Equal?: a == b = " + (a == b) );
            System.out.println("Not equal?: != b = " + (a != b) );
            System.out.println("More?: a > b = " + (a > b) );
            System.out.println("Less?: a < b = " + (a < b) );
            System.out.println("More or equal?: b >= a = " + (b >= a) );
            System.out.println("Less or equal?: b <= a = " + (b <= a) );

//            bitwise operations
            int c = 0;
            c = a & b;
            System.out.println("a & b = " + c );
            c = a | b;
            System.out.println("a | b = " + c );
            c = a ^ b;
            System.out.println("a ^ b = " + c );
            c = ~a;
            System.out.println("~a = " + c );
            c = a << 2;
            System.out.println("a << 2 = " + c );
            c = a >> 3;
            System.out.println("a >> 3 = " + c );
            c = a >>> 4;
            System.out.println("a >>> 4 = " + c );

        }
}
