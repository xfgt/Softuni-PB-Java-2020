package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double strawberriesPrice = Double.parseDouble(sc.nextLine());
        double bananasKilograms = Double.parseDouble(sc.nextLine());
        double orangesKilograms = Double.parseDouble(sc.nextLine());
        double raspberriesKilograms = Double.parseDouble(sc.nextLine());
        double strawberriesKilograms = Double.parseDouble(sc.nextLine());

        double raspberriesPrice = strawberriesPrice / 2;
        double orangesPrice = raspberriesPrice - 0.4 * raspberriesPrice;
        double bananasPrice = raspberriesPrice - 0.8 * raspberriesPrice;

        double bananasSum = bananasKilograms * bananasPrice;
        double orangesSum = orangesKilograms * orangesPrice;
        double raspberriesSum = raspberriesKilograms * raspberriesPrice;
        double strawberriesSum =  strawberriesKilograms * strawberriesPrice;

        double totalSum = (raspberriesSum + orangesSum + bananasSum + strawberriesSum);

        System.out.printf("%.2f", totalSum);
    }
}
