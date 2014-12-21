package hw_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Vision on 21.12.2014 г..
 */
public class SumNumbersFromTextFile {
    public static void main(String[] args) {
        sumFileContents(getInputFileName());
    }

    static String getInputFileName() {
        Scanner in = new Scanner(System.in);
        String filename = null;

        try {
            System.out.println("Enter the filename:");
            filename = in.next("\\w+.?\\w{2,5}");

        } catch (Exception e) {
            System.err.println("Invalid Format!");
            getInputFileName();
        }

        return filename;
    }

    static void sumFileContents(String fileName) {
        try (
                FileReader fr = new FileReader(fileName);
                BufferedReader streamReader = new BufferedReader(fr)
        ) {
            String line = streamReader.readLine();
            ArrayList<Integer> numbers = new ArrayList<>();
            int sum = 0;

            while (line != null) {
                numbers.add(Integer.parseInt(line));
                line = streamReader.readLine();
            }

            for (int i:numbers) {
                sum += i;
            }

            System.out.println(sum);

        } catch (Exception e) {
            System.err.println("Error");
        }
    }
}
