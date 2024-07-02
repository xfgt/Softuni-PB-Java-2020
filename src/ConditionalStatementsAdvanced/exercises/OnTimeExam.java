package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class OnTimeExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHours = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arriveHours = Integer.parseInt(scanner.nextLine());
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examTime = examHours * 60 + examMinutes;
        int arriveTime = arriveHours * 60 + arriveMinutes;

        String output1 = "";
        String output2 = "";

        // on time
        if (arriveTime <= examTime && arriveTime >= examTime - 30) {
            output1 = "On time";

            int difference = examTime - arriveTime;
            if (difference < 60) {
                output2 = String.format("%d minutes before the start", difference);
            }

            // early
        } else if (arriveTime < examTime - 30) {
            output1 = "Early";

            int difference = examTime - arriveTime;

            if (difference < 60) {
                output2 = String.format("%d minutes before the start", difference);
            } else {
                int hours = difference / 60;
                int minutes = difference % 60;

                output2 = String.format("%d:%02d hours before the start", hours, minutes);
            }

            // late
        } else if (arriveTime > examTime) {
            output1 = "Late";
            int difference = arriveTime - examTime;

            if (difference < 60) {
                output2 = String.format("%d minutes after the start", difference);

            } else {
                int hours = difference / 60;
                int minutes = difference % 60;
                output2 = String.format("%d:%02d hours after the start", hours, minutes);
            }
        }
        System.out.println(output1);
        System.out.println(output2);
    }
}
