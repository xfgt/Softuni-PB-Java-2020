package ExamPreparation.March2020;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int allFood = Integer.parseInt(scanner.nextLine());

        double biscuits = 0;
        double eatenFoodDog = 0;
        double eatenFoodCat = 0;

        for (int i = 1; i <= days; i++) { // четем докато не стигнем лимита на дните (3)

            double dogFood = Integer.parseInt(scanner.nextLine());
            double catFood = Integer.parseInt(scanner.nextLine());

            eatenFoodDog += dogFood; // увеличаваме стойноста
            eatenFoodCat += catFood; // увеличаваме стойноста

            if (i % 3 == 0) { // на всеки трети ден, награда: бисквитка
                double currentBisquits = (dogFood + catFood) * 0.1; // количеството на бисквитките са 10% от общата изядена храна
                biscuits += currentBisquits; // увеличаваме броя на бисквитките
            }

        }

        double allEatenFood = eatenFoodDog + eatenFoodCat; // цялата изядена храна

        double percentFood = (allEatenFood / allFood) * 100;     
        double percentDog = (eatenFoodDog / allEatenFood) * 100;
        double percentCat = (eatenFoodCat / allEatenFood) * 100;

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", percentFood);
        System.out.printf("%.2f%% eaten from the dog.%n", percentDog);
        System.out.printf("%.2f%% eaten from the cat.", percentCat);

    }
}
