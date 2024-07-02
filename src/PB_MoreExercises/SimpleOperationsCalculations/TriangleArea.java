package PB_MoreExercises.SimpleOperationsCalculations;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // area = a * h / 2

        double area, a , h;

        a = Double.parseDouble(sc.nextLine());
        h = Double.parseDouble(sc.nextLine());

        area = a * h / 2;

        System.out.printf("%.2f", area);
    }
}
