package ForLoops.exercises;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        boolean isLostSalary = false;
        for (int i = 0; i < tabs; i++) {
            String currentTab = scanner.nextLine();

            switch (currentTab) {
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                isLostSalary = true;
                break;//prekusni for cikula pri "true"
            }
        }

        if (isLostSalary) {
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%.0f", salary);
        }

    }
}
