package ru.job4j.loop;

public class Factorial {

    /**
     *
     * @param n Значение параметра n, для которого вычисляется факториал
     * @return Значение n!. При этом по определению 0! = 1.
     */
    public static int calc(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
