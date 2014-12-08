package hw_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bkolev on 8.12.2014 г..
 */
public class Generate3LetterWords {
    public static void main(String[] args) {
        System.out.println(collectAllThreeLetterCombinations(getInputString()));
    }

    public static String getInputString() {
        Scanner in = new Scanner(System.in);
        String input = new String();

        try {
            System.out.println("Enter a word (1 to 3 symbols)");
            input = in.next("\\w+");
        } catch (Exception e) {
            System.err.println("Invalid Format!");
            getInputString();
        }

        return input;
    }

    public static ArrayList<String> collectAllThreeLetterCombinations(String inputStr) {
        ArrayList<String> symmetricIntegers = new ArrayList<String>();
        StringBuilder strBuilder = new StringBuilder(inputStr);
        int strBuilderLen = strBuilder.length();

        for (int i = 0; i < strBuilderLen; i++) {
            for (int j = 0; j < strBuilderLen; j++) {
                for (int k = 0; k < strBuilderLen; k++) {
                    symmetricIntegers.add(new StringBuilder().append(strBuilder.charAt(i)).append(strBuilder.charAt(j)).append(strBuilder.charAt(k)).toString());
                }
            }
        }

        return symmetricIntegers;
    }
}
