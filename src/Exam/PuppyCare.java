package Exam;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine());

        int quantityGrams = food * 1000;

        int totalGrams = 0;

        String line = scanner.nextLine();

        while (!line.equals("Adopted")){
            int currentNum = Integer.parseInt(line);
            totalGrams += currentNum;

            line = scanner.nextLine();
        }

        if (totalGrams <= quantityGrams){
            System.out.printf("Food is enough! Leftovers: %d grams.", quantityGrams - totalGrams);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", totalGrams - quantityGrams);
        }

    }
}
