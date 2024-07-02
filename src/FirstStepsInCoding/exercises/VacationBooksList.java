package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberPages = Integer.parseInt(sc.nextLine());
        int pages = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        int readTime = numberPages / pages;
        int hoursADay = readTime / days;

        System.out.println(hoursADay);
    }
}
