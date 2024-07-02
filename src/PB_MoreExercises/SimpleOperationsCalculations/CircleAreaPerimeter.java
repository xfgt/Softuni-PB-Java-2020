package PB_MoreExercises.SimpleOperationsCalculations;

import java.util.Scanner;

public class CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = Double.parseDouble(sc.nextLine());

        double area, perimeter;

        area = Math.PI * r*r;
        perimeter = 2 * Math.PI * r;

        System.out.printf("%.2f", area);
        System.out.println();
        System.out.printf("%.2f", perimeter);
    }
}
