package Exam;

import java.util.Scanner;

public class SpaceShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред е широчината на кораба - реално число в интервала [1.00... 10.00]
        //•	На втория ред е  дължината на кораба - реално число в интервала [1.00…10.00]
        //•	На третия ред е височината на кораба - реално число в интервала [1.00…20.00]
        //•	На четвъртия ред е средната височина на астронавтите  -  реално число в интервала [1.50 … 1.90]
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double averageHeight = Double.parseDouble(scanner.nextLine());

        double volumeRocket = width * length * height;
        double volumeRoom = (averageHeight + 0.40) * 2 * 2;

        double sum = volumeRocket / volumeRoom;
        if (sum < 3){
            System.out.println("The spacecraft is too small.");
        } else if (sum >= 3 && sum <= 10){
            System.out.printf("The spacecraft holds %.0f astronauts.", Math.floor(sum));
        } else {
            System.out.println("The spacecraft is too big.");
        }
    }
}
