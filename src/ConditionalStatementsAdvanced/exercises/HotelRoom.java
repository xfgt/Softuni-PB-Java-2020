package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine(); //  May, June, July, August, September или October
        int nights = Integer.parseInt(scanner.nextLine()); //броят на нощувките

        double studioPriceNight = 0;
        double apartmentPriceNight = 0;

        double discountStudio = 0;
        double discountApartment = 0;

        double sumStudio = 0;
        double sumApartment = 0;

        switch (season) {
            case "May":
            case "October":
                studioPriceNight = 50;
                apartmentPriceNight = 65;

                // За студио, при повече от 7 нощувки през май и октомври : 5% намаление.
                if (nights > 7 && nights <= 14) {
                    discountStudio = studioPriceNight * 0.05; // 5%
                    sumStudio = studioPriceNight - discountStudio; //total

                    // За студио, при повече от 14 нощувки през май и октомври : 30% намаление.
                } else if (nights > 14) {
                    discountStudio = studioPriceNight * 0.3;
                    sumStudio = studioPriceNight - discountStudio;
                }

                // За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
                if (nights < 14) {
                    sumApartment = apartmentPriceNight;
                } else if (nights >= 14) {
                    discountApartment = apartmentPriceNight * 0.1;
                    sumApartment = apartmentPriceNight - discountApartment;
                }
                break;

            case "June":
            case "September":
                studioPriceNight = 75.20;
                apartmentPriceNight = 68.70;
                // За студио, при повече от 14 нощувки през юни и септември: 20% намаление.
                if (nights <= 14) {
                    sumStudio = studioPriceNight;
                } else if (nights > 14) {
                    discountStudio = studioPriceNight * 0.2;
                    sumStudio = studioPriceNight - discountStudio;
                }

                // За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
                if (nights <= 14) {
                    sumApartment = apartmentPriceNight;
                } else if (nights > 14) {
                    discountApartment = apartmentPriceNight * 0.1;
                    sumApartment = apartmentPriceNight - discountApartment;
                }
                break;

            case "July":
            case "August":
                studioPriceNight = 76;
                apartmentPriceNight = 77;
                sumStudio = studioPriceNight;

                // За апартамент, при повече от 14 нощувки, без значение от месеца : 10% намаление.
                if (nights <= 14) {
                    sumApartment = apartmentPriceNight;
                } else if (nights > 14) {
                    discountApartment = apartmentPriceNight * 0.1;
                    sumApartment = apartmentPriceNight - discountApartment;
                }
                break;

        }

        //  Print
        System.out.printf("Apartment: %.2f lv.%n", sumApartment * nights);
        System.out.printf("Studio: %.2f lv.", sumStudio * nights);
    }
}
