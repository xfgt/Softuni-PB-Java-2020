package PB_MoreExercises.ConditionalStatements;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double poolVolume = Integer.parseInt(scanner.nextLine());
        double p1perHour = Integer.parseInt(scanner.nextLine()); // проценти (100 => 100 * hours)
        double p2perHour = Integer.parseInt(scanner.nextLine()); // проценти (120 => 120 * hours)
        double hours = Double.parseDouble(scanner.nextLine());

        double litersPipe1 = p1perHour * hours;   //300
        double litersPipe2 = p2perHour * hours;   //360
        double totalLiters = litersPipe1 + litersPipe2;   //300 + 360 = 660 => 66% ===> 600 = 60% ====> 100 = 10% -> (0.1)

        // procent = (izkaranoto * 100) / granciata
        //660 == 66% litri = procenti

        //filled pool
        double percentagePool = totalLiters / 10;
//        System.out.printf("filled: %s%%", percentagePool);


        //pipe 1
        double pipe1 = totalLiters - litersPipe1;
        double percentagePipe1 = (pipe1 * 100) / totalLiters;
//        System.out.println();
//        System.out.printf("pipe 1: %.2f%%", percentagePipe2);

        //pipe 2
        double pipe2 = totalLiters - litersPipe2;
        double percentagePipe2 = (pipe2 * 100) / totalLiters;
//        System.out.println();
//        System.out.printf("pipe 2: %.2f%%", percentagePipe1);


        if (totalLiters < poolVolume) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", percentagePool, percentagePipe2, percentagePipe1);

        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, totalLiters - poolVolume);
        }


        //gets 30/100
    }
}
