package ForLoops.lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biggest = Integer.MAX_VALUE;
        int smallest = Integer.MIN_VALUE;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (num > smallest) smallest = num;
            if (num < biggest) biggest = num;
        }
        System.out.printf("Max number: %d%n", smallest);
        System.out.printf("Min number: %d", biggest);
    }
}
