package hw_1;

import java.util.Scanner;

/**
 * Created by bkolev on 3.12.2014 г..
 */
public class SumTwo {
    public static void main(String[] args) {
        printSumOfTwoInputIntegers();
    }

    public static void printSumOfTwoInputIntegers() {
        System.out.println("Enter an integer:");
        Scanner in = new Scanner(System.in);

        try{
            int first = in.nextInt();

            System.out.println("Enter another one:");
            int last = in.nextInt();

            System.out.println("The sum is:");
            System.out.println(first + last);

        } catch (Exception e){
            System.err.println("Invalid Format!");
            printSumOfTwoInputIntegers();
        }
    }
}
