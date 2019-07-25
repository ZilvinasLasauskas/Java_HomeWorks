package lt.bit.hw;

/*Parašykite programą, kuri skaičiuoja funkcijos y = 3x reikšmes, kai x keičiasi nuo 0 iki 10.
 */

public class op015 {
    public static void main(String[] args) {
        /* The case with random x

        float x = (float) (Math.random() * 10);
        float y = 3 * x;
        System.out.println("if x = " + x);
        System.out.println("y = 3x;  -->  y = " + y);

         */

        int x = 0;
        int y;
        System.out.println("   y = 3x;");
        while (x <= 10) {
            y = 3 * x;
            x++;
            System.out.println("if x = " + (x - 1) + ",  y= " + y);
        }
    }
}