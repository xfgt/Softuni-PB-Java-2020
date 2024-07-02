package WhileLoops.exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String favouriteBook = scanner.nextLine();
        String currentBook = scanner.nextLine();
        boolean isFound = false;
        int bookCount = 0;

        while (!currentBook.equals("No More Books")) {

            if (currentBook.equals(favouriteBook)) {
                isFound = true;
                break;
            }
            bookCount++; // number loops = number searched books

            // reading  the next book
            currentBook = scanner.nextLine();
        }

        String output = "";

        if (isFound) {
            output = String.format("You checked %d books and found it.", bookCount);
        } else {
            output = String.format("The book you search is not here!\n" + "You checked %d books.", bookCount);
        }
        System.out.println(output);
    }
}
