package ExamPreparation.March2020;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalkDay = Integer.parseInt(scanner.nextLine());
        int dailyWalks = Integer.parseInt(scanner.nextLine());
        int catCaloriesDay = Integer.parseInt(scanner.nextLine());

        int totalTimeWalking = minutesWalkDay * dailyWalks;

        int burnedCalories = totalTimeWalking * 5;
        double percentageCalories = catCaloriesDay * 0.5;

        if (burnedCalories >= percentageCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", burnedCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", burnedCalories);
        }

    }
}
