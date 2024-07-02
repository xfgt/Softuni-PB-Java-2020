package ConditionalStatements.exercises;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double grades = Double.parseDouble(scanner.nextLine());
        double minimalSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0.0;
        double perfectScholarship = 0.0;

        if (income < minimalSalary) {

            if (grades >= 4.5) {
                socialScholarship = Math.floor(minimalSalary * 0.35);

            }
        }

        if (grades >= 5.5) {
            perfectScholarship = Math.floor(grades * 25);
        }

        boolean isSocial = false;

        if (socialScholarship != 0) {
            if (socialScholarship > perfectScholarship) {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
                isSocial = true;
            }
        }

        if (perfectScholarship != 0) {
            if (!isSocial){
                System.out.printf("You get a scholarship for excellent results %.0f BGN", perfectScholarship);
            }
        }

        if (socialScholarship == 0){
            if (perfectScholarship == 0){
                System.out.println("You cannot get a scholarship!");
            }
        }

    }
}
