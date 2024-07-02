package PB_MoreExercises.SimpleOperationsCalculations;

import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //(b1 + b2) * h / 2
        double b1 = Double.parseDouble(sc.nextLine());
        double b2 = Double.parseDouble(sc.nextLine());
        double h = Double.parseDouble(sc.nextLine());

        double result = (b1 + b2) * h / 2;

        System.out.printf("%.2f", result);
    }
}
