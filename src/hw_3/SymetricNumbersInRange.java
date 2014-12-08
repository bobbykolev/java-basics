package hw_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bkolev on 8.12.2014 г..
 */
public class SymetricNumbersInRange {
    public static void main(String[] args) {
        System.out.println(collectSymmetricIntegers(getInputRange()));
    }

    public static int[] getInputRange() {
        Scanner in = new Scanner(System.in);
        int[] input = new int[2];

        try {
            System.out.println("Enter two positive integers:");
            input[0] = in.nextInt();
            input[1] = in.nextInt();
        } catch (Exception e) {
            System.err.println("Invalid Format!");
            getInputRange();
        }

        return input;
    }

    public static ArrayList<Integer> collectSymmetricIntegers(int[] range) {
        //between 101 and 110 theres (110-101 + 1) numbers to check
        int len = range[1] - range[0] + 1;

        //ArrayList - easy to add unknown number of symmetric items
        ArrayList<Integer> symmetricIntegers = new ArrayList<Integer>();

        for (int i = 0; i < len; i++) {
            StringBuilder strBuilder = new StringBuilder(Integer.toString(range[0]+i));
            int strBuilderLen = strBuilder.length();
            int temp = 0;

            for (int j = 0; j < strBuilderLen/2; j++) {
                if(Character.getNumericValue(strBuilder.charAt(j)) == Character.getNumericValue(strBuilder.charAt(strBuilderLen-j-1))) {
                    temp++;
                }
            }

            if (temp == strBuilderLen/2) {
                symmetricIntegers.add(range[0] + i);
            }
        }

        return symmetricIntegers;
    }
}
