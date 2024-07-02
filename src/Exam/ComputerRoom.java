package Exam;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред - месецът - текст с възможности: "march", "april", "may", "june", "july", "august"
        //•	На втория ред - броят на прекараните часове - цяло число в диапазона [1...10]
        //•	На третия ред - броят на хората в групата -  цяло число в диапазона [1...10]
        //•	На четвъртия ред - времето от деня – текст с възможности: "day", "night"

        String month = scanner.nextLine();
        int hoursPlayed = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double price = 0;
        switch (month) {

            case "march":
            case "april":
            case "may":
                if ("day".equals(dayOrNight)) {
                    price = 10.50;
                } else if ("night".equals(dayOrNight)) {
                    price = 8.40;
                }
                break;

            case "june":
            case "july":
            case "august":
                if ("day".equals(dayOrNight)) {
                    price = 12.60;
                } else if ("night".equals(dayOrNight)) {
                    price = 10.20;
                }
                break;
        }
        //(10.50 * 3 човека) * 3 часа = 94.50 лв.
        //Месецът е july и времето от деня е night -> цената е 10.20 лв. на човек.
        //Има отстъпка, понеже хората в групата (5) са повече от четирима => 10.20 – 10% = 9.18 лв.
        //Има отстъпка понеже часовете престой (5) са 5 или повече => 9.18 – 50% = 4.59 лв. за час на човек.
        //Обща цена за посещението: (4.59 * 5 човека) * 5 часа = 114.75 лв.
        double sum = 0;
        if (people >= 4 && hoursPlayed >= 5) {
            price = price - (price * 0.1);
            price = price - (price * 0.5);
            sum = (price * people) * hoursPlayed;
            System.out.printf("Price per person for one hour: %.2f%n", price);
            System.out.printf("Total cost of the visit: %.2f", sum);
        } else if (people < 4 && hoursPlayed >= 5) {
            price = price - (price * 0.5);
            sum = (price * people) * hoursPlayed;
            System.out.printf("Price per person for one hour: %.2f%n", price);
            System.out.printf("Total cost of the visit: %.2f", sum);
        } else if (people >= 4 && hoursPlayed < 5){
            price = price - (price * 0.1);
            sum = (price * people) * hoursPlayed;
            System.out.printf("Price per person for one hour: %.2f%n", price);
            System.out.printf("Total cost of the visit: %.2f", sum);
        } else {
            sum = (price * people) * hoursPlayed;
            System.out.printf("Price per person for one hour: %.2f%n", price);
            System.out.printf("Total cost of the visit: %.2f", sum);
        }

    }
}
