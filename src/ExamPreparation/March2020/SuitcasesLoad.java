package ExamPreparation.March2020;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String input = null;
        double suitcaseVol = 0;
        int counter = 0;
        while (true) {
            input = scanner.nextLine();

            if (input.equals("End")) {
                System.out.println("Congratulations! All suitcases are loaded!");
                break;
            }

            suitcaseVol = Double.parseDouble(input);

            if (counter % 2 == 0 && counter != 0) {
                suitcaseVol = suitcaseVol + (suitcaseVol * 0.1);
            }

            if (capacity < suitcaseVol) {
                System.out.println("No more space!");
                break;
            }

            capacity -= suitcaseVol;
            counter++;
        }

        System.out.printf("Statistic: %d suitcases loaded.\n", counter);
    }
}
