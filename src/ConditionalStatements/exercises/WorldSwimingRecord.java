package ConditionalStatements.exercises;

import java.util.Scanner;

public class WorldSwimingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());

        double lag = Math.floor(distance / 15) * 12.5;
        double time = distance * timePerMeter + lag;

        if (time < currentRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", time - currentRecord);
        }

    }
}
