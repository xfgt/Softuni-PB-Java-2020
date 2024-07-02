package PB_MoreExercises.SimpleOperationsCalculations;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        x – височината на къщата – реално число в интервала [2...100]
        double x = Double.parseDouble(sc.nextLine());

//        y – дължината на страничната стена – реално число в интервала [2...100]
        double y = Double.parseDouble(sc.nextLine());

//        h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]
        double h = Double.parseDouble(sc.nextLine());


//        6
//        10
//        5.2


//        СТЕНИ
//        Страничната стена е с площ – 6*10 = 60;
        double side_Wall = x * y;

//        Прозорецът е с площ = 1.5*1.5 = 2.25;
        double window = 2.25;

//        Двете страници са общо – 2*60 - 2*2.25 = 115.5;
        double double_Sides = (2 * side_Wall) - (2 * window);

//        Задната стена – 6*6 = 36;
//        Вход: 1.2*2 = 2.4
        double back_Wall = x * x;
        double entrance = 2.4;

//        Общо предна и задна – 2*36 - 2.4 = 69.6
        double total_Back_Front_WALL = (2 * back_Wall) - entrance;

//        ОБЩА ПЛОЩ: 115.5 + 69.6 = 185.1 м2
        double TOTAL_PERIMETER = double_Sides + total_Back_Front_WALL;

//        Зелена боя = 185.1 / 3.4 = 54.44 литра
        double green_Paint = TOTAL_PERIMETER / 3.4;



//        ПОКРИВ

//        Двата правоъгълника на покрива – 2 * (6*10) = 120
        double roof_rectangles = 2 * (x * y);

//        Двата триъгълниците – 2 * (6*5.2 / 2) = 2 * 15.6 = 31.2
        double two_Triangles = (2 * (x * h)) / 2.0;

//        ОБЩА ПЛОЩ: 120 + 31.2 = 151.2 м2
        double TOTAL_PERIMETER_ROOF = roof_rectangles + two_Triangles;

//        Червена боя = 151.2 / 4.3 = 35.16 литр

        double red_Paint = TOTAL_PERIMETER_ROOF / 4.3;

        System.out.printf("%.2f", green_Paint);
        System.out.println();
        System.out.printf("%.2f", red_Paint);

    }
}
