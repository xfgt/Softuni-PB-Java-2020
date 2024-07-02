package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commission = 0.0;
        switch (town) {

            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    //5%
                    commission = sales * 0.05;

                } else if (sales >= 500 && sales <= 1000) {
                    //7%
                    commission = sales * 0.07;

                } else if (sales <= 10000) {
                    //8%
                    commission = sales * 0.08;

                } else if (sales > 10000) {
                    //12%
                    commission = sales * 0.12;

                }
                break;

            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    //4.5%
                    commission = sales * 0.045;
                } else if (sales >= 500 && sales <= 1000) {
                    //7.5%
                    commission = sales * 0.075;
                } else if (sales <= 10000) {
                    //10%
                    commission = sales * 0.10;
                } else if (sales > 10000) {
                    //13%
                    commission = sales * 0.13;
                }
                break;

            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    //5.5%
                    commission = sales * 0.055;
                } else if (sales >= 500&&sales <= 1000) {
                    //8%
                    commission = sales * 0.08;
                } else if (sales <= 10000) {
                    //12%
                    commission = sales * 0.12;
                } else if (sales > 10000) {
                    //14.5%
                    commission = sales * 0.145;
                }
                break;

        }
        if (commission <= 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commission);
        }
    }
}
