package ConditionalStatementsAdvanced.exercises;

import javax.sound.sampled.DataLine;
import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double expenses = 0;


        double Tulip = 2.80;
        double Narciss = 3;
        double Gadiol = 2.50;

        switch (flower) {
            case "Roses":
                expenses = numFlowers * 5;
                if (numFlowers > 80) {
                    expenses *= 0.90;
                }
                break;
            case "Dahlias":
                expenses = numFlowers * 3.80;
                if (numFlowers > 90) {
                    expenses *= 0.85;
                }
                break;
            case "Tulips":
                expenses = numFlowers * 2.80;
                if (numFlowers > 80) {
                    expenses *= 0.85;
                }
                break;
            case "Narcissus":
                expenses = numFlowers * 3.0;
                if (numFlowers < 120) {
                    //+ 15%
                    expenses *= 1.15;
                }
                break;
            case "Gladiolus":
                expenses = numFlowers * 2.5;
                if (numFlowers < 80) {
                    // + 20%
                    expenses *= 1.20;
                }
                break;
        }
        if (budget >= expenses) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numFlowers, flower, budget - expenses);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", expenses - budget);
        }
    }
}
