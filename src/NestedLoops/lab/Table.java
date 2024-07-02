package NestedLoops.lab;

public class Table {
    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10 ; y++) {
                // moje (x * y) s promenliva
                //int product = x * y;
                System.out.printf("%d * %d = %d%n", x, y, (x*y));
            }
        }
    }
}
