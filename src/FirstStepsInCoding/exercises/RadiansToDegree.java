package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class RadiansToDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rad = Double.parseDouble(sc.nextLine());

        double degree = rad * 180 / Math.PI;

        System.out.printf("%.0f", degree);
    }
}
