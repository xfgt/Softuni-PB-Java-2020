package ForLoops.exercises;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;
        double evenSum = 0.0;

        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        double oddSum = 0.0;

        double posNumbers = Double.parseDouble(scanner.nextLine());

        boolean isEvenMax = false;
        boolean isEvenMin = false;
        boolean isOddMax = false;
        boolean isOddMin = false;
        for (int i = 1; i <= posNumbers; i++) {
            double number = Double.parseDouble(scanner.nextLine());
            // even positions
            if (i % 2 == 0) {
                evenSum += number;
                //check min number
                if (number < evenMin) {
                    evenMin = number;
                    isEvenMin = true;
                }
                // check max number
                if (number > evenMax) {
                    evenMax = number;
                    isEvenMax = true;
                }
                // odd positions
            } else {
                oddSum += number;

                if (number < oddMin) {
                    oddMin = number;
                    isOddMin = true;
                }
                if (number > oddMax) {
                    oddMax = number;
                    isOddMax = true;
                }
            }
        }

        //ODD
        System.out.printf("OddSum=%.2f,%n", oddSum);

        if (isOddMin ){
            System.out.printf("OddMin=%.2f,%n", oddMin);

        }else {
            System.out.println("OddMin=No,");
        }
        if (isOddMax) {
            System.out.printf("OddMax=%.2f,%n", oddMax);

        }else{
            System.out.println("OddMax=No,");
        }
        //EVEN
        System.out.printf("EvenSum=%.2f,%n", evenSum);

        if (isEvenMin){
            System.out.printf("EvenMin=%.2f,%n", evenMin);

        }else{
            System.out.println("EvenMin=No,");
        }
        if (isEvenMax){
            System.out.printf("EvenMax=%.2f%n", evenMax);
        }else{
            System.out.println("EvenMax=No");
        }

    }
}
