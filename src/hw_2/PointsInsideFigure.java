package hw_2;

import java.util.*;

/**
 * Created by bkolev on 5.12.2014 г..
 */
public class PointsInsideFigure {
    public static void main(String[] args) {
        checkPointsInsideOrOutside();
    }

    public static void checkPointsInsideOrOutside() {
        Point bottomLeft = new Point(new double[]{12.5, 13.5});
        Point topLeft = new Point(new double[]{12.5, 6});
        Point bottomRight = new Point(new double[]{22.5, 13.5});
        //Point topRight = new Point(new double[]{22.5, 6});

        Point middleBottomleft = new Point(new double[]{17.5, 13.5});
        Point middleTopleft = new Point(new double[]{17.5, 8.5});
        Point middleBottomRight = new Point(new double[]{20, 8.5});
        //Point middleTopRight = new Point(new double[]{20, 13.5});

        Point point = new Point(convertUserInputToCoordinates());

        if (point.x < topLeft.x || point.y < topLeft.y
                || point.x > bottomRight.x || point.y > bottomLeft.y
                || (point.x > middleBottomleft.x && point.x < middleBottomRight.x
                    && point.y < middleBottomleft.y && point.y > middleTopleft.y)) {
            System.out.println("Outside");
            //easy for testing more cases with one compilation
            checkPointsInsideOrOutside();
        } else {
            System.out.println("Inside");
            //easy for testing more cases with one compilation
            checkPointsInsideOrOutside();
        }
    }

    public static double[] convertUserInputToCoordinates() {
        double[] coordinates = new double[2];
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter point coordinates:");

            for (int i = 0; i < 2; i++) {
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

class Point {
    double x;
    double y;

    public Point(double[] coordinates) {
        this.x = coordinates[0];
        this.y = coordinates[1];
    }
}
