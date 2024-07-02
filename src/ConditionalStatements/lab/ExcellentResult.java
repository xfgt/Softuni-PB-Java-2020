package ConditionalStatements.lab;

import java.util.Scanner;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade = Integer.parseInt(sc.nextLine());

        if (grade >= 5) {
            System.out.println("Excellent!");
        } else {
            System.out.println("The grade is smaller than 5!");
        }

    }
}
