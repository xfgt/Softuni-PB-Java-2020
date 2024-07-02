package ZOthers;

import java.util.Scanner;

public class starsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int n = Integer.parseInt(scanner.nextLine());

        // TRIANGLE
        for (int i = 0; i <= n; i++){
            System.out.println();
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
        }

    }
}