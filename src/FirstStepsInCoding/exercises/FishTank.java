package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = Double.parseDouble(sc.nextLine());
        double width = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());

        double volume = length * width * height * 0.001;

        double diff = percent * 0.01;

        double totalLiters = volume * (1 - diff);

        System.out.printf("%.2f", totalLiters);
    }
}
