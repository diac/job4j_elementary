package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return sqrt(
                pow(x2 - x1, 2) + pow(y2 - y1, 2)
        );
    }

    public static void main(String[] args) {
        final int x1 = 0, y1 = 0, x2 = 2, y2 = 0;

        double result = Point.distance(x1, y1, x2, y2);
        System.out.println(
                "Distance from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") is " + result
        );
    }
}
