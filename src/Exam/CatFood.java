package Exam;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cats = Integer.parseInt(scanner.nextLine());
//        1 кг храна = 12.45 лева.
        int countSmall = 0;
        int countBig = 0;
        int countHuge = 0;
        double sumGrams = 0.0;

        for (int i = 1; i <= cats ; i++) {
            int gramsFood = Integer.parseInt(scanner.nextLine());
            //•	Ако котката изяжда от 100 (вкл.)  до 200 грама, то тя попада в група 1: малки котки.
            //•	Ако котката изяжда от 200 (вкл.)  до 300 грама, то тя попада в група 2: големи котки.
            //•	Ако котката изяжда от 300 (вкл.)  до 400 грама, то тя попада в група 3: огромни котки.

            if (gramsFood >= 100 && gramsFood < 200){
                // group 1 (small cats)
                countSmall++;
                sumGrams += gramsFood;
            } else if (gramsFood >= 200 && gramsFood < 300){
                // group 2 (big cats)
                countBig++;
                sumGrams += gramsFood;
            } else if (gramsFood >= 300 && gramsFood <= 400){
                // group 3 (huge cats)
                countHuge++;
                sumGrams += gramsFood;
            }
        }
        double gramsTotal = sumGrams / 1000;
        double toMoney = gramsTotal * 12.45;


        System.out.printf("Group 1: %d cats.%n", countSmall);
        System.out.printf("Group 2: %d cats.%n", countBig);
        System.out.printf("Group 3: %d cats.%n", countHuge);
        System.out.printf("Price for food per day: %.2f lv.", toMoney);
    }
}
