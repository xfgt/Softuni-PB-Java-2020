package ConditionalStatementsAdvanced.lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double totalPrice = 0;
        switch (day) {
            //week
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":

                if (product.equals("banana")) {
                    totalPrice = quantity * 2.50;
                } else if (product.equals("apple")) {
                    totalPrice = quantity * 1.20;
                } else if (product.equals("orange")) {
                    totalPrice = quantity * 0.85;
                } else if (product.equals("grapefruit")) {
                    totalPrice = quantity * 1.45;
                } else if (product.equals("kiwi")) {
                    totalPrice = quantity * 2.70;
                } else if (product.equals("pineapple")) {
                    totalPrice = quantity * 5.50;
                } else if (product.equals("grapes")) {
                    totalPrice = quantity * 3.85;
                }
                break;
            //weekend
            case "Saturday":
            case "Sunday":
                if (product.equals("banana")) {
                    totalPrice = quantity * 2.70;
                } else if (product.equals("apple")) {
                    totalPrice = quantity * 1.25;
                } else if (product.equals("orange")) {
                    totalPrice = quantity * 0.90;
                } else if (product.equals("grapefruit")) {
                    totalPrice = quantity * 1.60;
                } else if (product.equals("kiwi")) {
                    totalPrice = quantity * 3.00;
                } else if (product.equals("pineapple")) {
                    totalPrice = quantity * 5.60;
                } else if (product.equals("grapes")) {
                    totalPrice = quantity * 4.20;
                }

                break;
        }
        if (totalPrice!=0){
            System.out.printf("%.2f", totalPrice);
        }else{
            System.out.println("error");
        }
    }
}
