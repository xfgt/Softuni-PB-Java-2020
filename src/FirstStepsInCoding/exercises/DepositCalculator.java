package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double depositValue = Double.parseDouble(sc.nextLine());
        int months = Integer.parseInt(sc.nextLine());
        double interestRate = Double.parseDouble(sc.nextLine());

        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double interestPerMonth = (depositValue * interestRate / 100) / 12;


        double cost = depositValue + months * interestPerMonth;
        System.out.println(cost);


    }
}