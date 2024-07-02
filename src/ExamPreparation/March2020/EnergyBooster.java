package ExamPreparation.March2020;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String smallOrBig = scanner.nextLine();
        int sets = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double price2 = 0;
        double price3 = 0;

        switch (smallOrBig) {

            case "small":
                // quantity 2
                if (fruit.equals("Watermelon")) {
                    price = 2 * 56;
                    price2 = price * sets;
                } else if (fruit.equals("Mango")) {
                    price = 2 * 36.66;
                    price2 = price * sets;
                } else if (fruit.equals("Pineapple")) {
                    price = 2 * 42.10;
                    price *= sets;
                } else if (fruit.equals("Raspberry")) {
                    price = 2 * 20;
                    price2 = price * sets;
                }
                break;

            case "big":
                // quantity 5
                if (fruit.equals("Watermelon")) {
                    price = 5 * 28.70;
                    price2 = price * sets;
                } else if (fruit.equals("Mango")) {
                    price = 5 * 19.60;
                    price2 = price * sets;
                } else if (fruit.equals("Pineapple")) {
                    price = 5 * 24.80;
                    price2 = price * sets;
                } else if (fruit.equals("Raspberry")) {
                    price = 5 * 15.20;
                    price2 = price * sets;
                }
                break;
        }
        if (price2 >= 400 && price2 <= 1000) {
            price2 *= 0.15;
            price3 = (price * sets) - price2;
            System.out.printf("%.2f lv.", price3);
        } else if (price2 > 1000) {
            price2 *= 0.5;
            price3 = (price * sets) - price2;
            System.out.printf("%.2f lv.", price3);
        } else {
            price3 = (price * sets) - price2;
            System.out.printf("%.2f lv.", price3);
        }
    }
}
