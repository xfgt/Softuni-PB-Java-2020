package WhileLoops.lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int border = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        while (sum < border) {
            int currentNum = Integer.parseInt(scanner.nextLine());
                sum += currentNum;
        }

        System.out.println(sum);
    }
}
