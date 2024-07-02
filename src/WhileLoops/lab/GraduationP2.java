package WhileLoops.lab;
import java.util.Scanner;

public class GraduationP2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int badGradesCounter = 0;
        double grades = 0.0;
        int clazz = 0;

        while (clazz < 12){
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4){
                badGradesCounter++;

                if (badGradesCounter == 2){
                    break;
                }
                continue;
            }

            clazz++;
            grades += grade;

        }


        if (clazz == 12){
            System.out.printf("%s graduated. Average grade: %.2f", studentName, grades /12);

        }else{
            System.out.printf("%s has been excluded at %d grade", studentName, clazz+1); // 8 instead 7
        }


    }
}