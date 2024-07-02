package WhileLoops.exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        change = Math.floor(change * 100); // 1.23 = 123.0 за да се сравни с if-else случаите
        int coins = 0;

        while (change > 0) {

            if (change >= 200) {
                coins++;
                change -= 200;
                // change = change - 200;
            } else if (change >= 100) { //123,0 е true
                coins++; // монетата за сега е 1лв. цял
                change -= 100; // махаме левчето и ни остават 23ст.
            } else if (change >= 50) {
                coins++;
                change -= 50;
            } else if (change >= 20) { // 23 ст true
                coins++; // вече монетите са 2 ( 1лв. и 20ст. цели )
                change -= 20; // махаме 20-те стотинки и ни остават само 3ст.
            } else if (change >= 10) {
                coins++;
                change -= 10;
            } else if (change >= 5) {
                coins++;
                change -= 5;
            } else if (change >= 2) { // 3 стотинки true
                coins++; // монетите са вече 3 ( 1лв, 20ст. и 2ст, защото 2 + 1 ст.)
                change -= 2;// махаме 2 стотинки и ни остава само една (1ст.)
            } else if (change >= 1) { // true за 1ст.
                coins++; // общо стават 4 монети ( 1лв, 20ст, 2ст и 1 ст.)
                change -= 1; // махаме и последната стотинка, за да излезнем от цикъла с false
            }

        }
        System.out.println(coins); // принтираме вече сумата от събраните монети (4)
    }
}
