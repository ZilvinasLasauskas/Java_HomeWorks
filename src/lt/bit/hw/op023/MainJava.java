package lt.bit.hw.op023;

public class MainJava {
    public static void main (String[] args) {
        Rectangular rectFigure = new Rectangular();
        rectFigure.readData();
        rectFigure.countSquarePerimeter();
        rectFigure.countSquareArea();
        rectFigure.printSquareArea();
    }
}
