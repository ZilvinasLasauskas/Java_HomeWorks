package lt.bit.hw.op030;

import java.util.Scanner;

public class CurrencyExchangeClient {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the currency to convert from (0) Euro, (1) US dollar, (2) GB pound, (3) CD dol, " +
                "(4) JP yen, (5) MX peso : ");
        int response1 = scan.nextInt();

        System.out.print("Enter an amount: ");
        double pintos = scan.nextDouble();
        CurrencyExchange currencyExchange1 = new CurrencyExchange(pintos);

        double value = 0;
        switch (response1) {
            case 0:
                value = pintos;
//                System.out.println(pintos);
                break;
            case 1:
                currencyExchange1.setDollar1(pintos);
                value = currencyExchange1.getDollar1();
//                System.out.println(currencyExchange1.getDollar1());
                break;
            case 2:
                currencyExchange1.setPound1(pintos);
                value = currencyExchange1.getPound1();
//                System.out.println(currencyExchange1.getPound1());
                break;
            case 3:
                currencyExchange1.setCad1(pintos);
                value = currencyExchange1.getCad1();
//                System.out.println(currencyExchange1.getCad1());
                break;
            case 4:
                currencyExchange1.setYen1(pintos);
                value = currencyExchange1.getYen1();
//                System.out.println(currencyExchange1.getYen1());
                break;
            case 5:
                currencyExchange1.setPeso1(pintos);
                value = currencyExchange1.getPeso1();
//                System.out.println(currencyExchange1.getPeso1());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + response1);
        }

        double euros;
        euros = value;

        System.out.println("Enter the currency to convert to (0) Euro, (1) US dollar, (2) GB pound, (3) CD dol, " +
                "(4) JP yen, (5) MX peso : ");
        int response2 = scan.nextInt();

        CurrencyExchange currencyExchange2 = new CurrencyExchange(euros);

        switch (response2) {
            case 0:
                System.out.printf("%.2f", euros);
                break;
            case 1:
                currencyExchange2.setDollar(euros);
                System.out.printf("%.2f",currencyExchange2.getDollar());
                break;
            case 2:
                currencyExchange2.setPound(euros);
                System.out.printf("%.2f", currencyExchange2.getPound());
                break;
            case 3:
                currencyExchange2.setCad(euros);
                System.out.printf("%.2f", currencyExchange2.getCad());
                break;
            case 4:
                currencyExchange2.setYen(euros);
                System.out.printf("%.2f", currencyExchange2.getYen());
                break;
            case 5:
                currencyExchange2.setPeso(euros);
                System.out.printf("%.2f", currencyExchange2.getPeso());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + response2);
        }
    }
}

