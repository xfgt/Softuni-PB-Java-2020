package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usd = Double.parseDouble(sc.nextLine());
        double bgn = usd * 1.79549;

        System.out.println(bgn);
    }
}
