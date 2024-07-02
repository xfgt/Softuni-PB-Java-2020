package PB_MoreExercises.SimpleOperationsCalculations;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //price
        double vegPriceKilo = Double.parseDouble(sc.nextLine());
        double fruitPriceKilo = Double.parseDouble(sc.nextLine());
        //weight
        double totalVegKilos = Double.parseDouble(sc.nextLine());
        double totalFruitKilos= Double.parseDouble(sc.nextLine());

        double calcVegs = vegPriceKilo * totalVegKilos;
        double calcFruits = fruitPriceKilo * totalFruitKilos;

        double bgnEnd = calcVegs + calcFruits;

        double swapInEuro = bgnEnd / 1.94;

        System.out.printf("%.2f", swapInEuro);

    }
}
