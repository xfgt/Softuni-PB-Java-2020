package NestedLoops.Book;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOrRows = Integer.parseInt(scanner.nextLine());

        // print the top row: + - - - + ( the same as bottom )
        System.out.print("+");
        for (int i = 0; i < numberOrRows - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");
        // print the middle rows | - - - |
        for (int row = 0; row < numberOrRows - 2; row++){
            System.out.print("|");
            for (int i = 0; i < numberOrRows - 2; i++) {
                System.out.print(" -");
            }
            System.out.println(" |");
        }
        // print the bottom row: + - - - + ( the same as top )
        System.out.print("+");
        for (int i = 0; i < numberOrRows - 2; i++) {
            System.out.print(" -");
        }
        System.out.println(" +");
    }
}
