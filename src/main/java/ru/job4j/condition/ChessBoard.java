package ru.job4j.condition;

import static java.lang.Math.abs;

public class ChessBoard {

    /**
     * Слон ходит по диагонали, соответственно абслютные велечины
     * изменений обеих координат должны совпадать
     * @param x1 Координата x исходной клетки
     * @param y1 Координата y исходной клетки
     * @param x2 Координата x конечной клетки
     * @param y2 Координата y конечной клетки
     * @return Количество клеток, пройденных фигурой
     *
     */
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {

            if (abs(x2 - x1) == abs(y2 - y1)) {
                rsl = abs(x2 - x1);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
