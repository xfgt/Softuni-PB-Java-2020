package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();

        int nights = days - 1;
        double price = 0.0;
        double finalPrice = 0.0;

        switch (roomType) {
            case "room for one person":
                price = 18.00;
                break;
            case "apartment":
                price = 25.00;
                break;
            case "president apartment":
                price = 35.00;
                break;
        }
        if (roomType.equals("room for one person")) {
            price = price;
        } else if (roomType.equals("apartment") && days < 10) {
            price = price * 0.7;
        } else if (roomType.equals("apartment") && days <= 15) {
            price = price * 0.65;
        } else if (roomType.equals("apartment") && days > 15) {
            price = price / 2;
        } else if (roomType.equals("president apartment") && days < 10) {
            price = price * 0.9;
        } else if (roomType.equals("president apartment") && days <= 15) {
            price = price * 0.85;
        } else if (roomType.equals("president apartment") && days > 15) {
            price = price * 0.8;
        }
        double secondPrice = nights * price;
        switch (rating) {
            case "positive":
                finalPrice = secondPrice + secondPrice * 0.25;
                break;
            case "negative":
                finalPrice = secondPrice * 0.9;
        }
        System.out.printf("%.2f", finalPrice);


    }
}


