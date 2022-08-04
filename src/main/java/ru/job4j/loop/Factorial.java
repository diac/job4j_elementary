package ru.job4j.loop;

public class Factorial {

    /**
     *
     * @param n Значение параметра n, для которого вычисляется факториал
     * @return Значение n!. При этом по определению 0! = 1. Для отрицательного n возвращается -1
     */
    public static int calc(int n) {
        if (n < 0) {
            return -1;
        }

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
