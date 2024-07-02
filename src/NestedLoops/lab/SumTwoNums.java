package NestedLoops.lab;

import java.util.Scanner;

public class SumTwoNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        boolean flag = false;

        int counterCombinations = 0; //0 комбинации
        for (int x = start; x <= end; x++) {
            for (int y = start; y <= end; y++) {
                counterCombinations++; // на всяка итерация(loop) се увеличават комбинациите
                if (x + y == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counterCombinations, x, y, magicNumber);
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
        }

        if (!flag){
            System.out.printf("%d combinations - neither equals %d", counterCombinations, magicNumber);
        }
    }
}
