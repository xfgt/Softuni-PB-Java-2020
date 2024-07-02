package Exam;

import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Цена за отпечатване на една страница - реално число в интервала (0.00…1.50]
        //•	Цена за отпечатване на една корица - реално число в интервала (0.00…5.00]
        //•	Процентно намаление за отпечатване на хартия - цяло число в интервала (0…100]
        //•	Сумата, която трябва да се заплати на дизайнер - реално число в интервала (0.00…150.00]
        //•	Процент от цялата дължима сума, който е заплатен от екипа - цяло число в интервала [0…100]

        double pagePrice = Double.parseDouble(scanner.nextLine());
        double koricaPrice = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double designerPay = Double.parseDouble(scanner.nextLine());
        int percentagePrice = Integer.parseInt(scanner.nextLine());

        double startingPricePrint = pagePrice * 899 + koricaPrice * 2;

        double discountPrice = startingPricePrint - (startingPricePrint * discount) / 100;
        double designerTax = discountPrice + designerPay;
        double finalPrice = designerTax - (designerTax * percentagePrice) / 100;

        System.out.printf("Avtonom should pay %.2f BGN.", finalPrice);
    }
}
