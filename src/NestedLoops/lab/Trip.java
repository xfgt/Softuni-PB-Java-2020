package NestedLoops.lab;

import java.util.Scanner;

public class Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        // 80/100
        while (!destination.equals("End")) {

            double budget = Double.parseDouble(scanner.nextLine()); // Setting loop budget money
            double sum = 0; // sum of the money ( 0 at the beginning )

            while (sum <= budget) { // statement if money enough or less

                sum += Double.parseDouble(scanner.nextLine()); // sum the money

            }

            System.out.printf("Going to %s!%n", destination); // output the destination
            destination = scanner.nextLine();
        }
    }
}
