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
        float in140 = 140;
        float in240 = 240;

        float expectedEuro = 2;
        float expectedDollars = 4;

        float euro = Converter.rubleToEuro(in140);
        boolean euroTestPassed = euro == expectedEuro;
        System.out.println("140 rubles are 2 euro. Test result: " + euroTestPassed);

        float dollars = rubleToDollar(in240);
        boolean dollarsTestPassed = dollars == expectedDollars;
        System.out.println("For 240 rubles you'll get $4. Test result: " + dollarsTestPassed);
    }
}
