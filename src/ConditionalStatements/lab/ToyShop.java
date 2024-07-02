package ConditionalStatements.lab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        double tripPrice = Double.parseDouble(scanner.nextLine());

        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());


        //totalNumbers
        int toysCount = puzzles + dolls + bears + minions + trucks;
        double price = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;


        //boolean isBiggerThan50 = toysCount >= 50; (true or false)
        if (toysCount >= 50) { // 25% discount
            price *= 0.75;
            // price = price * 0.75;
        }

        price *= 0.90;

        //boolean isTrPriceLower = tripPrice <= price (true or false)
        if (tripPrice <= price) {
            System.out.printf("Yes! %.2f lv left.", price - tripPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", tripPrice - price);
        }


    }
}
