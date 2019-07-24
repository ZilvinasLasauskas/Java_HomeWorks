package lt.bit.hw;

//Parašykite programą, kuri išveda į ekraną daugybos lentelę iki 10.

public class op017 {

    public static void main(String args[]) {
        int g = 8;
        int a;
        int b;
        for (a = 1; a <= g; a++) {
            for (b = 1; b <= g; b++) {
                System.out.format("%4d", a * b);
            }
            System.out.println();
        }
    }
}