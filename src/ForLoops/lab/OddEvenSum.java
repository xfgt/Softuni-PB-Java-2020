package ForLoops.lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= n; i++) {
            int scale = Integer.parseInt(scanner.nextLine());

            if (i % 2 == 0) evenSum += scale;
            else oddSum += scale;
        }
        int diff = evenSum - oddSum;
        if (diff == 0){
            System.out.printf("Yes\nSum = %d", evenSum); // even sum or odd sum, no matter
        }else{
            System.out.printf("No\nDiff = %d", Math.abs(diff));
        }
    }
}
