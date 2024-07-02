package FirstStepsInCoding.lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dogFood = 2.50;
        double otherFood = 4;

        int dogs = Integer.parseInt(sc.nextLine());
        int others = Integer.parseInt(sc.nextLine());

        System.out.println((dogFood * dogs) + (otherFood * others) + " lv.");
    }
}