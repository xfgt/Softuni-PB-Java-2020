package PB_MoreExercises.SimpleOperationsCalculations;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //(0°C × 9/5) + 32 = 32°F

        double c = Double.parseDouble(sc.nextLine());
        double fahr = (c * 9/5) + 32;

        System.out.printf("%.2f", fahr);
    }
}
