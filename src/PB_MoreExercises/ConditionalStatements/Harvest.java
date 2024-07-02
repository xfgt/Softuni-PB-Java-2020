package PB_MoreExercises.ConditionalStatements;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double z = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());

        //1 литър вино са нужни 2,5 кг. грозде
        //X квадратни метри се заделя 40% от реколтата за производство на вино
        //1 кв.м лозе се изкарват Y килограма грозде
        //Желаното количество вино за продан е Z литра.

        double grapes = x * y;
        double wine = (0.4 * grapes) / 2.5;

        double calc, litersPerPerson;

        if (wine >= z){
            calc = wine - z;
            litersPerPerson = calc / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n" +
                    "%.0f liters left -> %.0f liters per person.", Math.ceil(wine), Math.ceil(calc), Math.ceil(litersPerPerson));
        }else if (wine < z){
            calc = z - wine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(calc));
        }

    }
}
