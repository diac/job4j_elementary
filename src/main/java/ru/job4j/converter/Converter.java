package ru.job4j.converter;

public class Converter {
    private static final int EURO_EXCHANGE_RATE = 70;
    private static final int DOLLAR_EXCHANGE_RATE = 60;

    public static float rubleToEuro(float value) {
        return value / EURO_EXCHANGE_RATE;
    }

    public static float rubleToDollar(float value) {
        return value / DOLLAR_EXCHANGE_RATE;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        float dollars = rubleToDollar(240);
        System.out.println("For 240 rubles you'll get $" + dollars);
    }
}
