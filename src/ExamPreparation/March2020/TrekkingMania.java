package ExamPreparation.March2020;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int Musala = 0;
        int Montblanc = 0;
        int Kilimanjaro = 0;
        int K2 = 0;
        int Everest = 0;

        for (int i = 1; i <= groups; i++) {

            int alpinists = Integer.parseInt(scanner.nextLine());

            if (alpinists <= 5) {
                Musala += alpinists;
            } else if (alpinists >= 6 && alpinists <= 12) {
                Montblanc += alpinists;
            } else if (alpinists >= 13 && alpinists <= 25) {
                Kilimanjaro += alpinists;
            } else if (alpinists >= 26 && alpinists <= 40) {
                K2 += alpinists;
            } else if (alpinists >= 41) {
                Everest += alpinists;
            }
        }

        double allalpinists = Musala + Montblanc + Kilimanjaro + K2 + Everest;
        double percentMusala = (Musala / allalpinists) * 100;
        double percentMontblanc = (Montblanc / allalpinists) * 100;
        double percentKilimanjaro = (Kilimanjaro / allalpinists) * 100;
        double percentK2 = (K2 / allalpinists) * 100;
        double percentEverest = (Everest / allalpinists) * 100;


        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMontblanc);
        System.out.printf("%.2f%%%n", percentKilimanjaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%", percentEverest);
    }
}
