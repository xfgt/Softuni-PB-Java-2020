package ConditionalStatements.Book;

import java.util.Scanner;

public class dailyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workDays = Integer.parseInt(scanner.nextLine());
        double dailyMoney = Double.parseDouble(scanner.nextLine());
        double dollarToLeva = Double.parseDouble(scanner.nextLine());

        double monthSalary = workDays * dailyMoney;
        double yearProfit = monthSalary * 12 + monthSalary * 2.5;
        double tax = yearProfit * 0.25;
        double cleanYearProfit = yearProfit - tax;
        double toLeva = cleanYearProfit * dollarToLeva;
        double averageDailyProfit = toLeva / 365;

        System.out.printf("%.2f",averageDailyProfit);
    }
}
