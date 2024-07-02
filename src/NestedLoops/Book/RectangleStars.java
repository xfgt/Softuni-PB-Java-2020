package NestedLoops.Book;

import java.util.Scanner;

public class RectangleStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int outer = 1; outer <= n; outer++) {
            for (int inner = 1; inner <= n; inner++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
