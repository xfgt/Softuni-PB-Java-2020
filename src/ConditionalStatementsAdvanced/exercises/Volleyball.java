package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String year = scanner.nextLine(); //leap or normal (високосна или нормална)

        int p = Integer.parseInt(scanner.nextLine()); // брой празници в годината (които не са събота и неделя).
        int h = Integer.parseInt(scanner.nextLine()); // брой уикенди, в които Влади си пътува до родния град.

        double weekendsInSofia = 48 - h;
        double gamesInSofia = weekendsInSofia * (3.0 / 4);
        double gamesInHisCity = h;

        //holidays
        double gamesThroughHolidays = p * (2.0 / 3);
        double totalGamesPlayed = gamesInSofia + gamesInHisCity + gamesThroughHolidays;


        double gamesInleap = 0.0;
        double gamesInNormal = 0.0;
        double totalGamesALL = 0.0;



        switch (year) {
            case "leap":
                gamesInleap = totalGamesPlayed * 0.15;
                totalGamesALL = totalGamesPlayed + gamesInleap;
                break;

            case "normal":
                totalGamesALL = totalGamesPlayed;
                break;
        }


        System.out.println(Math.floor(totalGamesALL));
        System.out.println();
    }
}
