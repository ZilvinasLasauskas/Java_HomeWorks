package lt.bit.hw;

//Parašykite programą, kuri išveda į ekraną anglišką abėcėlę.

public class op018 {
    public static void main(String[] args) {
        for (char letter = 'a'; letter <= 'z'; letter++) {
            System.out.print(" " + letter + " ");
        }

        for (char letterUp = 'A'; letterUp <= 'Z'; letterUp++) {
            System.out.print(" " + letterUp + " ");
        }
    }
}