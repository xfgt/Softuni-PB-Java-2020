package PB_MoreExercises.SimpleOperationsCalculations;


import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sunny_INPUT = sc.next();


        if (sunny_INPUT.equals("sunny")){
            System.out.println("It's warm outside!");

        }else{
            System.out.println("It's cold outside!");
        }
    }
}
