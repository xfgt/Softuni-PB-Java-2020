package ConditionalStatements.exercises;

import java.util.Scanner;

public class GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;

        if (actors > 150){
            clothesPrice *= 0.9;
        }

        double totalExpenses = clothesPrice * actors + decorPrice;

        String output = "";

        if (budget >= totalExpenses){
            output = String.format("Action!\nWingard starts filming with %.2f leva left.", budget - totalExpenses);
        }else {
            output = String.format("Not enough money!\nWingard needs %.2f leva more.", totalExpenses - budget);
        }

        System.out.println(output);
    }
}
