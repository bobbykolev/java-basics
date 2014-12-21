package hw_3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Vision on 21.12.2014 г..
 */
public class AngleUnitConverter {
    public static final String DEGREES = "deg";
    public static final String RADIANS = "rad";

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);//use '.' for doubles
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter a number of conversions:");
            int n = in.nextInt();
            String[] list = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter angle and unit (deg or rad)");
                double angle = in.nextDouble();
                String units = in.next("\\w+");

                if (units.trim().equals(DEGREES)) {
                    list[i] = convertFromDegToRad(angle);
                } else if (units.trim().equals(RADIANS)) {
                    list[i] = convertFromRadToDeg(angle);
                }
            }

            //for printing on new line (as the example) we could print it
            //directly into the if statements w/o array...
            System.out.println(Arrays.toString(list));

        } catch (Exception e) {
            System.err.println("Invalid Format!");
        }
    }

    public static String convertFromDegToRad (double deg) {
        double rad = deg*(Math.PI/180);
        return String.format( "%.6f", rad) + " " + RADIANS;
    }

    public static String convertFromRadToDeg (double rad) {
        double deg = rad*(180/Math.PI);
        return String.format( "%.6f", deg) + " " + DEGREES;
    }
}
