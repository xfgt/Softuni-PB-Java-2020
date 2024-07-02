package WhileLoops.exercises;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        //there ends the cake parameters input

        int cakePieces = length * width; // pieces cake calculations

        // reading first input
        String line = scanner.nextLine();

        // check if it's finished
        boolean isFinished = false;

        while (!line.equals("STOP")) {
            // string to input
            int piecesCount = Integer.parseInt(line);

            cakePieces -= piecesCount; //100 -> 80

            if (cakePieces <= 0) {
                isFinished = true;
                break;
            }

            //reading after loop
            line = scanner.nextLine();
        }


        String output = "";

        if (isFinished) {
            output = String.format("No more cake left! You need %d pieces more.", Math.abs(cakePieces));
                                                                        // one point from '0' is 1 координатна система
                                                                        // (-1 in calculations)
        } else {
            output = String.format("%d pieces are left.", cakePieces);
        }
        System.out.println(output);
    }
}
