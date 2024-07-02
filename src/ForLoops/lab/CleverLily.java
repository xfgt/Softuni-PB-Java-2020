package ForLoops.lab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int priceToy = Integer.parseInt(scanner.nextLine());

        int toysCount = 0;
        double money = 10;
        double sum = 0;

        for (int i = 1; i <= age; i++) {
            // even year
            if (i % 2 == 0) {
                sum += money;
                sum -= 1;
                money += 10;

                // odd year
            } else {
                toysCount++;
            }
        }

        sum += priceToy * toysCount;

        if (priceWashingMachine <= sum) {
            System.out.printf("Yes! %.2f", sum - priceWashingMachine);
        } else {
            System.out.printf("No! %.2f", priceWashingMachine - sum);
        }
    }
}
