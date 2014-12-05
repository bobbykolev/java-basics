package hw_2;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by bkolev on 5.12.2014 г..
 */
public class TheSmallestOfThree {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);//use '.' for doubles
        double[] numbers = getThreeDoublesFromUserInput();

        System.out.println(findMin(numbers));
    }

    public static double[] getThreeDoublesFromUserInput() {
        int n = 3;
        double[] num = new double[n];
        Scanner in = new Scanner(System.in);

        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Enter a number:");

                num[i] = in.nextDouble();
            }
        } catch (Exception e) {
            System.err.println("Invalid Format!");
            getThreeDoublesFromUserInput();
        }

        return num;
    }

    public static double findMin(double[] numbers) {
        //1)
        if (numbers.length == 3) {
            return Math.min(Math.min(numbers[0], numbers[1]), numbers[2]);
        }

        //2) for an array of any length
        double tempMin = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (tempMin > numbers[i]) {
                tempMin = numbers[i];
            }
        }

        return tempMin;

        //3)Arrays.sort(numbers);return numbers[0];
    }
}
