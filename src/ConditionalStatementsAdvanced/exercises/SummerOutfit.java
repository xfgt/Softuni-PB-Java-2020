package ConditionalStatementsAdvanced.exercises;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        String Outfit = "";
        String Shoes = "";
        switch (day) {

            case "Morning":
                if (degrees >= 10 && degrees <= 18) {
                    Outfit = "Sweatshirt";
                    Shoes = "Sneakers";

                } else if (degrees <= 24) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";

                }else{
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                }
                break;

            case "Afternoon":
                if (degrees >= 10 && degrees <= 18) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";

                } else if (degrees <= 24) {
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";

                }else{
                    Outfit = "Swim Suit";
                    Shoes = "Barefoot";

                }
                break;

            case "Evening":
                if (degrees >= 10 && degrees <= 18) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";

                } else if (degrees <= 24) {
                    Outfit = "Shirt";
                    Shoes = "Moccasins";

                }else{
                    Outfit = "Shirt";
                    Shoes = "Moccasins";

                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, Outfit, Shoes);
    }
}
