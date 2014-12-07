package hw_2;

import java.util.Scanner;

/**
 * Created by bkolev on 5.12.2014 г..
 */
public class TriangleArea {
    public static void main(String[] args) {
        double[] coordinates = convertUserInputToCoordinates();

        Triangle triangle = new Triangle(coordinates);

        System.out.println("The Area of the triangle is:" + triangle.calculateArea());
    }

    public static double[] convertUserInputToCoordinates() {
        double[] coordinates = new double[6];
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter triangle coordinates (separated by empty space or new line):");

            for (int i = 0; i < 6; i++) {
                String[] input = in.next("(-)?\\d+(\\.\\d+)?").split(" ");

                for (int j = 0; j < input.length; j++) {
                    coordinates[i + j] = Double.parseDouble(input[j]);
                    i += j;
                }
            }
        } catch (Exception e) {
            System.err.println("Invalid Format!");
            convertUserInputToCoordinates();
        }

        return coordinates;
    }
}

class Triangle {
    double ax;
    double ay;
    double bx;
    double by;
    double cx;
    double cy;

    public Triangle(double[] coordinates) {
        ax = coordinates[0];
        ay = coordinates[1];
        bx = coordinates[2];
        by = coordinates[3];
        cx = coordinates[4];
        cy = coordinates[5];
    }

    public double calculateArea() {
        return Math.abs((ax * (by - cy) + bx * (cy - ay) + cx * (ay - by)) / 2);
    }
}
