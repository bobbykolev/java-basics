package hw_3;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Created by Vision on 21.12.2014 г..
 */
public class DaysBetweenTwoDates {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter first date (d-mm-yyyy):");
            String firstDate = in.next("[\\d-]+");

            System.out.println("Enter second date (d-mm-yyyy):");
            String secondDate = in.next("[\\d-]+");

            SimpleDateFormat df = new SimpleDateFormat("d-MM-yyyy");
            //get time, subtract one from other, divide by 1000 (sec), 3600 (ours), 24 (days)
            System.out.println(Math.abs((df.parse(firstDate).getTime() - df.parse(secondDate).getTime())/(1000*3600*24)));

        } catch (Exception e) {
            System.err.println("Invalid Format!");
        }
    }
}
