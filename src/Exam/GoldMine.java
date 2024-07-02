package Exam;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int location = Integer.parseInt(scanner.nextLine());

        double averageMined = 0.0;
        double dailyGold = 0.0;
        double expectedGold = 0.0;
        int daysMining = 0;

        for (int i = 1; i <= location; i++) {
            double counter = 0.0;
            expectedGold = Double.parseDouble(scanner.nextLine());
            daysMining = Integer.parseInt(scanner.nextLine());

            for (int j = 1; j <= daysMining; j++) {
                dailyGold = Double.parseDouble(scanner.nextLine());
                counter += dailyGold;
                averageMined = counter / daysMining;
            }


            if (averageMined >= expectedGold) {
                System.out.printf("Good job! Average gold per day: %.2f.%n", averageMined);

            } else {
                System.out.printf("You need %.2f gold.", expectedGold - averageMined);
            }
        }
    }
}

