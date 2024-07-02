package WhileLoops.exercises;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // PROMENLIVI

        String input = null; // input = nishto
        int step = 0; // inicializirane na stupki

        // LOGIKA

        // dokato stupkite sa po-malko ot goal(10 000) i ne se pribira (!GOINGHOME == NOT GOING HOME)
        while (step < 10000 && !"Going home".equals(input = scanner.nextLine())) {
            // stupkite se uvelichavat na vseki input
            step += Integer.parseInt(input);
        }

        // PRINTIRANE

        // ako se pribira
        if ("Going home".equals(input)) {
            step += Integer.parseInt(scanner.nextLine());
        }
        // ako stupkite sa po malko ot 10 000
        if (step < 10000) {
            System.out.printf("%d more steps to reach goal.", 10000 - step);
            // inache: ( sa poveche ot 10 000 )
        } else {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", step - 10000);
        }

        
    }
}
