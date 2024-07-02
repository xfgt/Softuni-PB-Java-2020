package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int validDays = Integer.parseInt(sc.nextLine());
        int chefs = Integer.parseInt(sc.nextLine());
        int cakes = Integer.parseInt(sc.nextLine());
        int waffles = Integer.parseInt(sc.nextLine());
        int pancakes = Integer.parseInt(sc.nextLine());


        int cakePrice = 45;
        double wafflePrice = 5.80;
        double pancakePrice = 3.20;


        int cakesPrice = cakes * cakePrice;
        double wafflesPrice = waffles * wafflePrice;
        double pancakesPrice = pancakes * pancakePrice;


        double totalPrice = (cakesPrice + wafflesPrice + pancakesPrice) * chefs;

        double totalCampaignPrice = totalPrice * validDays;
        double all = totalCampaignPrice - totalCampaignPrice * 1.0 / 8;

        System.out.printf("%.2f", all);


    }
}
