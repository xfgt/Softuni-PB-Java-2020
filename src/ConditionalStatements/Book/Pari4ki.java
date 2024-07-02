package ConditionalStatements.Book;

import java.util.Scanner;

public class Pari4ki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bitcoins = Double.parseDouble(scanner.nextLine());
        double yoans = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine()) / 100;

        double bitcoinsToLeva = bitcoins * 1168; // 1168 leva (1)
        double yoanToDollars = yoans * 0.15; // 0.15 dollars (one), for 5 is 0.75 dollars
        // 0.75 долара = 1.32 лева ( 1.32 / 0.75 = 1.76 )
        double dollarsToLeva = yoanToDollars * 1.76;

        double euro = (bitcoinsToLeva + dollarsToLeva) / 1.95 - ((bitcoinsToLeva + dollarsToLeva) / 1.95 * commission);

        System.out.println(euro);
    }
}
