package hw_2;

import java.util.Scanner;

/**
 * Created by bkolev on 5.12.2014 г..
 */
public class RectangleArea {
    public static void main(String[] args) {
        printAreaOfTwoInputSides();
    }

    public static void printAreaOfTwoInputSides() {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter first side length:");
            int first = in.nextInt();

            System.out.println("Enter other side length:");
            int last = in.nextInt();

            System.out.println("The Area is:");
            System.out.println(first * last);

        } catch (Exception e) {
            System.err.println("Invalid Format!");
            printAreaOfTwoInputSides();
        }
    }
}
