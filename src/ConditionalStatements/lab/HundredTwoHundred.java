package ConditionalStatements.lab;

import java.util.Scanner;

public class HundredTwoHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        if (number < 100){
            System.out.println("Less than 100");
        }
        else if(number >= 100 && number <= 200){
            System.out.println("Between 100 and 200");
        }
        else if (number > 200) {
            System.out.println("Greater than 200");
        }
    }
}
