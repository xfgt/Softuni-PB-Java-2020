package ZOthers;

import java.util.Scanner;

public class passwordLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (true) {
            System.out.println("Enter password: ");

            if (input.equals("pass")) {
                System.out.println("Success!\n");
                break;
            }

            System.out.println("no, try again\n");
        }

    }
}
