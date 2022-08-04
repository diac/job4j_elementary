package ru.job4j.loop;

public class Mortgage {

    /**
     *
     * @param amount Сумма кредита
     * @param salary Зарплата
     * @param percent Процентная ставка по кредиту
     * @return Количество лет, необходимое на погашение кредита при заданных параметрах
     */
    public static int year(double amount, int salary, double percent) {
        int year = 0;

        while (amount > 0) {
            amount += amount * percent / 100;
            amount -= salary;
            year++;
        }
        return year;
    }
}