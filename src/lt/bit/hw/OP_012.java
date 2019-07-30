package lt.bit.hw;

//Parašykite programą, kuri realizuoja įvairių geometrinių figūrų (kvadratas, apskritimas ir t.t.) ploto skaičiuoklę.
// Kuriant paprogrames turi būti panaudotas paprogramių perkrovimo (Overload) mechanizmas.


public class OP_012 {
    static int squareCounter(int border) {
        return border * border;
    }

    static int squareCounter(int borderA, int borderB) {
        return borderA * borderB;
    }

    static double squareCounter(int radius, double pi) {
        return radius * radius * pi;
    }

    static float squareCounter(int side, int altitude, float coeff) {
        return (side * altitude) / coeff;
    }

    public static void main(String[] args) {
        System.out.println("Kvadrato plotas: " + OP_012.squareCounter(11));
        System.out.println("Staciakampio plotas: " + OP_012.squareCounter(13, 15));
        System.out.println("Skritulio plotas: " + OP_012.squareCounter(16, Math.PI));
        System.out.println("Trikampio plotas: " + OP_012.squareCounter(16, 9, 2));

    }
}
