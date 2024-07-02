package PB_MoreExercises.ConditionalStatements;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double freeDays = Integer.parseInt(scanner.nextLine());

        //(workdays * 63mins + freeDays * 127mins)

        double realPlayTimeOnWork = (365 - freeDays) * 63;
        double realPlayTimeFree = freeDays * 127;
        double realPlayTimeTotal = realPlayTimeOnWork + realPlayTimeFree;
        // basic play time = 30 000

        double differenceInPlayTime = 30000 - realPlayTimeTotal;

        double hours = differenceInPlayTime / 60;
        double minutes = differenceInPlayTime % 60;


        double extraTime = realPlayTimeTotal - 30000;
        double extraHours = extraTime / 60;
        double extraMinutes = extraTime % 60;

        if (realPlayTimeTotal < 30000) {
            System.out.printf("Tom sleeps well\n%.0f hours and %.0f minutes less for play", Math.floor(hours), minutes);
        } else {
            System.out.printf("Tom will run away\n%.0f hours and %.0f minutes more for play", Math.floor(extraHours), extraMinutes);
        }

    }
}
