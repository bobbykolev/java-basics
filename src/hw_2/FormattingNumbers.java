package hw_2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by bkolev on 5.12.2014 г..
 */
public class FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);//use '.' for doubles

        getInputDataAndPrintItFormatted();
    }

    public static void getInputDataAndPrintItFormatted() {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter an integer:");
            int a = in.nextInt();
            System.out.println("Enter floating-point number:");
            double b = in.nextDouble();
            System.out.println("Enter one more floating-point number:");
            double c = in.nextDouble();

            String hex = Integer.toHexString(a).toUpperCase();
            String bin = addLeadingZeroes(Integer.toBinaryString(a));


            System.out.printf("|%-10s|%s|%10.2f|%-10.3f|", hex, bin, b, c);

        } catch (Exception e) {
            System.err.println("Invalid Format!");
            getInputDataAndPrintItFormatted();
        }
    }

    public static String addLeadingZeroes(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        int len = strBuilder.length();

        if (len < 10) {
            for (int i = 0; i < 10 - len; i++) {
                strBuilder.insert(0, 0);
            }
        }

        return strBuilder.toString();
    }
}
