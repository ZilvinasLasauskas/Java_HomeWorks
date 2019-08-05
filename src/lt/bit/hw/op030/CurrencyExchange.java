package lt.bit.hw.op030;

public class CurrencyExchange {

    private double euro, pintos, dollar, pound, cad, yen, peso;

    private static final double DOLLAR = 1.11045;
    private static final double POUND = 0.91273;
    private static final double CAD = 1.46564;
    private static final double YEN = 118.37;
    private static final double PESO = 21.4176;
    private static final double DOLLAR1 = 1 / DOLLAR;
    private static final double POUND1 = 1 / POUND;
    private static final double CAD1 = 1 / CAD;
    private static final double YEN1 = 1 / YEN;
    private static final double PESO1 = 1 / PESO;

    public <pintos> CurrencyExchange() {
        pintos = 0;
    }

    public void setDollar1(double pintos) {
        dollar = pintos * DOLLAR1;
    }

    public double getDollar1() {
        return dollar;
    }

    public void setPound1(double pintos) {
        pound = pintos * POUND1;
    }

    public double getPound1() {
        return pound;
    }

    public void setCad1(double pintos) {
        cad = pintos * CAD1;
    }

    public double getCad1() {
        return cad;
    }

    public void setYen1(double pintos) {
        yen = pintos * YEN1;
    }

    public double getYen1() {
        return yen;
    }

    public void setPeso1(double pintos) {
        peso = pintos * PESO1;
    }

    public double getPeso1() {
        return peso;
    }

    public CurrencyExchange(double euros) {
        euro = euros;
    }

    public void setDollar(double euros) {
        dollar = euros * DOLLAR;
    }

    public double getDollar() {
        return dollar;
    }

    public void setPound(double euros) {
        pound = euros * POUND;
    }

    public double getPound() {
        return pound;
    }

    public void setCad(double euros) {
        cad = euros * CAD;
    }

    public double getCad() {
        return cad;
    }

    public void setYen(double euros) {
        yen = euros * YEN;
    }

    public double getYen() {
        return yen;
    }

    public void setPeso(double euros) {
        peso = euros * PESO;
    }

    public double getPeso() {
        return peso;
    }
}
