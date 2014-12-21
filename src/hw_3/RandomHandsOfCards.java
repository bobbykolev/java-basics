package hw_3;

import com.sun.media.sound.InvalidFormatException;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Vision on 21.12.2014 г..
 */
public class RandomHandsOfCards {
    public static void main(String[] args) {
        String[] faces = {"A", "K", "D", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        String[] colors = {"\u2660", "\u2665", "\u2666", "\u2663"};

        int facesLen = faces.length;
        int colorsLen = colors.length;

        HashMap<Integer, String> cards = new HashMap<Integer, String>();

        for (int i = 0; i < colorsLen; i++) {
            for (int j = 0; j < facesLen; j++) {
                cards.put((i * facesLen) + j, faces[j] + colors[i]);
            }
        }

        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter integer between 1 and 10:");
            int hands = in.nextInt();

            if (hands > 0 && hands < 11) {
                printRandomHands(cards, hands);
            } else {
                throw new InvalidFormatException();
            }

        } catch (Exception e) {
            System.out.println("Invalid format: enter integer between 1 and 10!");
        }

    }

    public static void printRandomHands(HashMap<Integer, String> cards, int hands) {
        int key;
        int handLength = 5;

        for (int k = 0; k < hands; k++) {
            for (int l = 0; l < handLength; l++) {
                do {
                    key = randInt(0, 51);
                } while (!cards.containsKey(key));

                System.out.print(cards.get(key));
                cards.remove(key);
            }
            System.out.println();
        }
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
