package FirstStepsInCoding.lab;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName, lastName, town;
        int age;

        firstName = scan.nextLine();
        lastName = scan.nextLine();
        age = Integer.parseInt(scan.nextLine());
        town = scan.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.",
                firstName, lastName, age, town);
    }
}
