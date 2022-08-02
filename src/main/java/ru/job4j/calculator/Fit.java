package ru.job4j.calculator;

public class Fit {
    private static final float OPTIMAL_WEIGHT_FACTOR = 1.15f;

    public static double manWeight(short height) {
        return (height - 100) * OPTIMAL_WEIGHT_FACTOR;
    }

    public static double womanWeight(short height) {
        return (height - 110) * OPTIMAL_WEIGHT_FACTOR;
    }

    public static void main(String[] args) {
        short height = 187;

        double man = Fit.manWeight(height);
        System.out.println("Perfect weight for a " + height + "cm tall man is " + String.format("%.2f", man)  + "kg");

        double womanPerfectWeight = womanWeight(height);
        System.out.println("Perfect weight for a " + height + "cm tall woman is " + String.format("%.2f", womanPerfectWeight)   + "kg");
    }
}
