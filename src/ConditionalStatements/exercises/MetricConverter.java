package ConditionalStatements.exercises;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());

        String mValueInp = scanner.nextLine();
        String mValueOut = scanner.nextLine();

        // 1meter = 1000mm, 100cm
        //1 mm = 0.001m, 1cm = 0.01m


        if (mValueInp.equals("mm")){
            number /= 1000;

        }else if (mValueInp.equals("cm")){
            number /= 100;
        }else if (mValueInp.equals("m")){
            number /= 1;
        }

        if (mValueOut.equals("mm")){
            number *= 1000;
        }else if (mValueOut.equals("cm")){
            number *= 100;

        }else if(mValueOut.equals("m")){
            number *= 1;
        }

        System.out.printf("%.3f", number);

    }
}
