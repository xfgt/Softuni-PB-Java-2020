package NestedLoops.Exercises;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 0;

        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                counter++; // броене
                System.out.print(counter + " ");
                if (counter >= n) {
                    break; // за вътрешен цикъл
                            // ако има return; спира цялата програма (лоша практика)
                }
            }

            if (counter >= n) {
                break; // за външен цикъл
            }
            System.out.println();
        }
    }
}
