package PB_MoreExercises.SimpleOperationsCalculations;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double length, width;

        // 520cm = 5.2, 480cm = 4.8

        length = Double.parseDouble(sc.nextLine());
        width = Double.parseDouble(sc.nextLine());


        double lines, desksPerLine;

        lines = length * 1 / 1.2;
        desksPerLine = (width * 1 - 1) / 0.7;

        double r = Math.floor(lines);
        double v = Math.floor(desksPerLine);
        double sum = (r* v) - 3;

        System.out.printf("%.0f", sum);

    }
}
