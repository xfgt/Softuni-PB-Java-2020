package ConditionalStatements.exercises;

import java.util.Scanner;

public class TimePlus15Mins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeA = Integer.parseInt(scanner.nextLine());
        int timeB = Integer.parseInt(scanner.nextLine());

        int sumTime = timeA * 60 + timeB; // обща стойност на въведените данни
        int sumTime15 = sumTime + 15; // тази стойност + 15 минути

        int hours =  sumTime15 / 60; // часове: (финалната обща стойност + 15 минути / 60)
        int minutes = sumTime15 % 60; // минути: (финалната обща стойност + 15 минути % 60)

        // ако часовете превъртат или са равни на 24 часа, ми ги извади
        if (hours >= 24) {
            hours = hours - 24;
            //hours -= 24;
        }

        System.out.printf("%d:%02d", hours, minutes);
        //%02d е за минутите:   "ако стойноста е по-малка от 10 тогава ми вкарай една нула"
    }
}

