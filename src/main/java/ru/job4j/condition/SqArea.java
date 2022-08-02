package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        final double h = p / (2 * (k + 1));
        final double l = h * k;
        return  l * h;
    }

    public static void main(String[] args) {
        final double p = 6, k = 2;

        double result1 = SqArea.square(p, k);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
