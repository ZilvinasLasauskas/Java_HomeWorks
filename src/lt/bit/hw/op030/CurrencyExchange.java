package lt.bit.hw.op030;

public class CurrencyExchange {

    private double euro;
    private double dollar, pound, cad, yen, peso;
//    private double currency;

    private static final double DOLLAR = 1.11045;
    private static final double POUND = 0.91273;
    private static final double CAD = 1.46564;
    private static final double YEN = 118.37;
    private static final double PESO = 21.4176;

//    public CurrencyExchange() {
//        euro = 0;
//    }

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

//    public double getCurrency() {
//        return currency;
//    }
}
