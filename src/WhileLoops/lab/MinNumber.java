package WhileLoops.lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int minN = Integer.MAX_VALUE;
        int number;

        while (!input.equals("Stop")){
            number = Integer.parseInt(input);

            if (number < minN){
                minN = number;
            }

            input = scanner.nextLine();
        }
        System.out.println(minN);
    }
}
