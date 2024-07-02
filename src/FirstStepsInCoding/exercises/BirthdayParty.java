package FirstStepsInCoding.exercises;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hallRent = Integer.parseInt(sc.nextLine());


        double cake = hallRent * 0.20;
        double drinks = cake - cake * 0.45;
        double animator = hallRent * 1.0 / 3;


        double result = hallRent + cake + drinks + animator;

        System.out.println(result);
    }
}
