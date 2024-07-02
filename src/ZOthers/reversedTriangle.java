package ZOthers;

import java.util.Scanner;

public class reversedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // reversed triangle
        System.out.print("Enter a value: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            System.out.println();
            for (int j = 0; j < n-i; j++){
                System.out.print("*");
            }
        }

    }
}
