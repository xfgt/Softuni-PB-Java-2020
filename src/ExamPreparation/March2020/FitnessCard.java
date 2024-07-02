package ExamPreparation.March2020;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double price = 0.0;

        switch (gender) {

            case "f":

                if (sport.equals("Gym")) {
                    price = 35;
                } else if (sport.equals("Boxing")) {
                    price = 37;
                } else if (sport.equals("Yoga")) {
                    price = 42;
                } else if (sport.equals("Zumba")) {
                    price = 31;
                } else if (sport.equals("Dances")) {
                    price = 53;
                } else if (sport.equals("Pilates")) {
                    price = 37;
                }
                break;

            case "m":
                if (sport.equals("Gym")) {
                    price = 42;
                } else if (sport.equals("Boxing")) {
                    price = 41;
                } else if (sport.equals("Yoga")) {
                    price = 45;
                } else if (sport.equals("Zumba")) {
                    price = 34;
                } else if (sport.equals("Dances")) {
                    price = 51;
                } else if (sport.equals("Pilates")) {
                    price = 39;
                }
                break;
        }
        // Всички цени на карти за ученици (възраст под 19 години вкл.) са с 20% намаление.
        String output = null;

        if (money >= price && age >= 19) {
            output = String.format("You purchased a 1 month pass for %s.", sport);
        } else if (money >= price && age < 19) {
            price *= 0.8;
            output = String.format("You purchased a 1 month pass for %s", sport);
        } else if (money < price && age <= 19) {
            price *= 0.8;
            output = String.format("You don't have enough money! You need $%.2f more.", price - money);
        } else if (money < price && age > 19) {
            output = String.format("You don't have enough money! You need $%.2f more.", price - money);
        }
        System.out.println(output);
    }
}

