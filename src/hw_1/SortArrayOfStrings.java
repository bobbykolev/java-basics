package hw_1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by bkolev on 4.12.2014 г..
 */
public class SortArrayOfStrings {
    public static void main(String[] args) {
        printSortedNInputWords();
    }

    public static void printSortedNInputWords() {
        System.out.println("Enter the number of cities:");
        Scanner in = new Scanner(System.in);

        try{
            int n = in.nextInt();
            String[] words = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Enter city [" + (n-i) + "]:");
                String input = in.next("\\w+");
                words[i] = capitalizeString(input);
            }

            Arrays.sort(words);

            System.out.println("Sorted:");
            System.out.println(Arrays.toString(words));

        } catch (Exception e){
            System.err.println("Invalid Format!");
            printSortedNInputWords();
        }
    }

    public static String capitalizeString(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.setCharAt(0, Character.toUpperCase(strBuilder.charAt(0)));
        return strBuilder.toString();
    }
}
