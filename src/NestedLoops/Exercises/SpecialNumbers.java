package NestedLoops.Exercises;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        // хилядите
        for (int i = 1; i <= 9; i++) {
            // стотиците
            for (int j = 1; j <= 9; j++) {
                // десетиците
                for (int k = 1; k <= 9; k++) {
                    // единиците
                    for (int l = 1; l <= 9; l++) {

                        if (n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0){
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }

    }
}
