package ExamPreparation.March2020;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pencils = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double cleaner = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double pencilsPrice = 5.80 * pencils;
        double markersPrice = 7.20 * markers;
        double cleanerPrice = 1.20 * cleaner;

        double total = pencilsPrice + markersPrice + cleanerPrice;
        double totalWithDiscount = total - ((total * discount) / 100);

        System.out.printf("%.3f", totalWithDiscount);

    }
}
