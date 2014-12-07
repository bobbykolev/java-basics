package hw_2;

import java.util.Scanner;

/**
 * Created by Vision on 7.12.2014 г..
 */
public class CountOfEqualBitPairs {
    public static void main(String[] args) {
        int count = countEqualBItPairs(Integer.toBinaryString(getInputInteger()));

        System.out.println(count);
    }

    public static int getInputInteger() {
        Scanner in = new Scanner(System.in);
        int input = 0;

        try {
            System.out.println("Enter an integer:");
            input = in.nextInt();
        } catch (Exception e) {
            System.err.println("Invalid Format!");
            getInputInteger();
        }

        return input;
    }

    public static int countEqualBItPairs(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        int len = strBuilder.length();
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (i + 1 < len) {
                if (Character.getNumericValue(strBuilder.charAt(i)) == Character.getNumericValue(strBuilder.charAt(i + 1))) {
                    count++;
                }
            }
        }

        return count;
    }
}
