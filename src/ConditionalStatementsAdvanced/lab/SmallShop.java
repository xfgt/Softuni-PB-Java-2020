package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double priceTotal = 0.0;
        switch (town) {

            case "Sofia":
                if (product.equals("coffee")){
                    priceTotal = quantity * 0.50;
                } else if (product.equals("water")){
                    priceTotal = quantity * 0.80;
                } else if (product.equals("beer")){
                    priceTotal = quantity * 1.20;
                } else if (product.equals("sweets")){
                    priceTotal = quantity * 1.45;
                } else if (product.equals("peanuts")){
                    priceTotal = quantity * 1.60;
                }
                break;

            case "Plovdiv":
                if (product.equals("coffee")){
                    priceTotal = quantity * 0.40;
                } else if (product.equals("water")){
                    priceTotal = quantity * 0.70;
                } else if (product.equals("beer")){
                    priceTotal = quantity * 1.15;
                } else if (product.equals("sweets")){
                    priceTotal = quantity * 1.30;
                } else if (product.equals("peanuts")){
                    priceTotal = quantity * 1.50;
                }
                break;

            case "Varna":
                if (product.equals("coffee")){
                    priceTotal = quantity * 0.45;
                } else if (product.equals("water")){
                    priceTotal = quantity * 0.70;
                } else if (product.equals("beer")){
                    priceTotal = quantity * 1.10;
                } else if (product.equals("sweets")){
                    priceTotal = quantity * 1.35;
                } else if (product.equals("peanuts")){
                    priceTotal = quantity * 1.55;
                }
                break;
        }
        System.out.println(priceTotal);
    }
}
