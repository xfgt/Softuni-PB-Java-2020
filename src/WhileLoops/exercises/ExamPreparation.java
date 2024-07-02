package WhileLoops.exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poorGradesLimit = Integer.parseInt(scanner.nextLine());

        String task = scanner.nextLine();
        int poorGrades = 0;
        int allGradesSum = 0;
        int gradesCount = 0;
        String currentTask = "";

        boolean isFailed = false;
        while (!task.equals("Enough")) {
            //прочитаме оценката
            int grade = Integer.parseInt(scanner.nextLine());
            allGradesSum += grade;
            gradesCount++;

            if (grade <= 4) {
                poorGrades++;
                if (poorGrades == poorGradesLimit) {
                    isFailed = true;
                    break;
                }
            }

            currentTask = task;
            // ЗАДЪЛЖИТЕЛНО
            task = scanner.nextLine();
        }


        double averageScore = 1.0 * allGradesSum / gradesCount;
        String output = "";

        //Print
        if (isFailed) {
            output = String.format("You need a break, %d poor grades.", poorGrades);
        } else {
            output = String.format("Average score: %.2f%n" +
                    "Number of problems: %d%n" +
                    "Last problem: %s", averageScore, gradesCount, currentTask);
        }
        System.out.println(output);

    }
}
