package NestedLoops.lab;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();

        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        while (!"Finish".equals(movieName)) {
            int freeSpacesInCinema = Integer.parseInt(scanner.nextLine());
            int currentMoviePeople = 0;
            for (int i = 0; i < freeSpacesInCinema; i++) {
                String ticketType = scanner.nextLine();
                if ("student".equals(ticketType)) {
                    studentTickets++;
                } else if ("standard".equals(ticketType)) {
                    standardTickets++;
                } else if ("kid".equals(ticketType)) {
                    kidTickets++;
                } else if ("End".equals(ticketType)) {
                    break;
                }
                currentMoviePeople++;
            }
            double precentage = currentMoviePeople * 1.0 / freeSpacesInCinema * 100;
            System.out.printf("%s - %.2f%% full.%n", movieName, precentage);
            movieName = scanner.nextLine();
        }

        int totalTickets = standardTickets + studentTickets + kidTickets;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidTickets * 1.0 / totalTickets * 100);
    }
}
