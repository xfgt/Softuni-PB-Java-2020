package ConditionalStatements.Book;

import java.util.Scanner;

public class transportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв./км. Нощна тарифа: 0.90 лв./км.
        // Автобус. Дневна / нощна тарифа: 0.09 лв./км. Може да се използва за разстояния минимум 20 км.
        // Влак. Дневна / нощна тарифа: 0.06 лв./км. Може да се използва за разстояния минимум 100 км.

        int distance = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        double taxiRate = 0.70;
        double busRate = 0;
        double trainRate = 0;

        double price = 0;

        if ("day".equals(time)) {
            taxiRate = 0.79;
        } else if ("night".equals(time)) {
            taxiRate = 0.90;
        }

        if (distance < 20) {
            price = 0.70 + (distance * taxiRate);
        } else if (distance > 20 && distance < 100) {
            price = distance * 0.09;
        } else {
            price = distance * 0.06;
        }
        System.out.println(price);
    }
}
