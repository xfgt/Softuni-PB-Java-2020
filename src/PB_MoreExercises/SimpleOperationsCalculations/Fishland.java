package PB_MoreExercises.SimpleOperationsCalculations;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        price
        double PRICE_skumriq = Double.parseDouble(sc.nextLine());
        double PRICE_caca = Double.parseDouble(sc.nextLine());

//        weight
        double WEIGHT_palamud = Double.parseDouble(sc.nextLine());
        double WEIGHT_safrid = Double.parseDouble(sc.nextLine());
        double WEIGHT_midi = Double.parseDouble(sc.nextLine());

//        Паламуд – 60% по-скъп от скумрията
//        Сафрид – 80% по-скъп от цацата
//        Миди – 7.50 лв. за килограм



//        Цена на паламуда = 6.90 + 6.90 * 0.60 = 11.04 лв. за килограм
        double palamud = PRICE_skumriq + PRICE_skumriq * 0.60;

//        Цена на сафрид = 4.20 + 4.20 * 0.80 =  7.56 лв. за килограм
        double safrid = PRICE_caca + PRICE_caca * 0.80;

//        Сума миди = 1 * 7.50 = 7.50
        double midi = WEIGHT_midi * 7.50;



//        Сума паламуд = 1.5 * 11.04 = 16.56
        double SUM_palamud = WEIGHT_palamud * palamud;

//        Сума сафрид = 2.5 * 7.56 = 18.90
        double SUM_safrid = WEIGHT_safrid * safrid;

//        Сметка = 16.56 + 18.90 + 7.50 = 42.96
        double SUM_SUM_ALL = SUM_palamud + SUM_safrid + midi;

        System.out.printf("%.2f", SUM_SUM_ALL);


    }
}
