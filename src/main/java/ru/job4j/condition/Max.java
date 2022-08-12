package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return (left > right) ? left : right;
    }

    public static int max(int i, int j, int k) {
        return max(i, max(j, k));
    }

    public static int max(int i, int j, int k, int l) {
        return max(
                i,
                max(
                    j,
                    max(k, l)
                )
        );
    }
}
