package hw_2;

import java.util.Scanner;

/**
 * Created by bkolev on 5.12.2014 г..
 */
public class DecimalToHexadecimal {
    public static void main(String[] args) {
        printHexOfIntInput();
    }

    public static void printHexOfIntInput() {
        System.out.println("Enter an integer:");
        Scanner in = new Scanner(System.in);

        try {
            int i = in.nextInt();
            String hex = Integer.toHexString(i);
            System.out.println("Hex value of \""+ i +"\" is " + hex.toUpperCase());
        } catch (Exception e) {
            System.err.println("Invalid Format!");
            printHexOfIntInput();
        }
    }
}
