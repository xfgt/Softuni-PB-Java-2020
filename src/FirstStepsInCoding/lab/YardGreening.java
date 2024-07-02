package FirstStepsInCoding.lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = 7.61;
        double discount = 0.18;

        double areaForGreening = Double.parseDouble(sc.nextLine());

        double finP2 = (areaForGreening * price) * discount;
        double finP1 = (areaForGreening * price) - finP2;


        System.out.println("The final price is: " + finP1 + " lv.");
        System.out.println("The discount is: " + finP2 + " lv.");
    }
}

