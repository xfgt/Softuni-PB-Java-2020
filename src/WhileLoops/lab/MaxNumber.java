package WhileLoops.lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int maxN = Integer.MIN_VALUE;
        int number;

        while (!input.equals("Stop")){
            number = Integer.parseInt(input);

            if (number > maxN){
                maxN = number;
            }

            input = scanner.nextLine();
        }
        System.out.println(maxN);
    }
}
