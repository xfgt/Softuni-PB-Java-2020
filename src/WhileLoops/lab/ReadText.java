package WhileLoops.lab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String input = scanner.nextLine();
            if (input.equals("Stop")){
                System.out.println("Stopping . . ."); //remove this line
                break;
            }
            System.out.println(input);
        }

    }
}
