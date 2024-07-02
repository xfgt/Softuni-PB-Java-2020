package NestedLoops.Exercises;

import java.util.Scanner;

public class PrimeNonPrimeSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        int primeSum = 0;
        int nonPrimeSum = 0;
        while (!line.equals("stop")){

            boolean isNonPrime = false;
            int number = Integer.parseInt(line);

            // negative number
            if (number < 0){
                System.out.println("Number is negative.");
                line = scanner.nextLine();
                continue;
            }

            // for-loop from 2 to number -1
            for (int i = 2; i < number ; i++) {

                if (number % i == 0){
                    isNonPrime = true;
                    break;
                }

            }
            if (isNonPrime){
                nonPrimeSum += number;

            }else{
                primeSum += number;
            }
            // следващ ред
            line = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrimeSum);
    }
}
