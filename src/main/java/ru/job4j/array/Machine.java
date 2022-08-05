package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int coinIndex = 0; coinIndex < coins.length; coinIndex++) {
            while (change >= coins[coinIndex]) {
                change -= coins[coinIndex];
                rsl[size++] = coins[coinIndex];
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
