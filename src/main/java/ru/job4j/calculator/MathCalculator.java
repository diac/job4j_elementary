package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    /**
     *
     * @param first Первый аргумент операции
     * @param second Второй аргумент операции
     * @return Сумма двух операций из класса MathFunction: разность двух чисел и деление двух чисел
     */
    public static double subtractionPlusDivision(double first, double second) {
        return sum(sub(first, second), div(first, second));
    }

    /**
     *
     * @param first Первый аргумент операции
     * @param second Второй аргумент операции
     * @return Сумма вычисления всех четырех операций из класса MathFunction
     */
    public static double sumAllOperations(double first, double second) {
        return sum(
                sum(sum(first, second), sub(first, second)),
                sum(multiply(first, second), div(first, second))
        );
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply() равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета subtractionPlusDivision() равен: " + subtractionPlusDivision(10, 20));
        System.out.println("Результат расчета sumAllOperations() равен: " + sumAllOperations(10, 20));
    }
}
