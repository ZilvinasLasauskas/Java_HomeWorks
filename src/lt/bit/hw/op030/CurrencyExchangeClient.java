package lt.bit.hw.op030;

import java.util.Scanner;

public class CurrencyExchangeClient {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an Euro amount: ");
        double euros = scan.nextDouble();

        System.out.println("Enter the currency to convert to (1) US dollar, (2) GB pound, (3) CD dol, " +
                "(4) JP yen, (5) MX peso : ");
        int response = scan.nextInt();

        CurrencyExchange currencyExchange = new CurrencyExchange(euros);

        switch (response) {
            case 1:
                currencyExchange.setDollar(euros);
                System.out.println(currencyExchange.getDollar());
                break;
            case 2:
                currencyExchange.setPound(euros);
                System.out.println(currencyExchange.getPound());
                break;
            case 3:
                currencyExchange.setCad(euros);
                System.out.println(currencyExchange.getCad());
                break;
            case 4:
                currencyExchange.setYen(euros);
                System.out.println(currencyExchange.getYen());
                break;
            case 5:
                currencyExchange.setPeso(euros);
                System.out.println(currencyExchange.getPeso());
                break;
        }
//        System.out.println(currencyExchange.getCurrency());
    }
}

