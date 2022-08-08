package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        if (left.length == 0) {
            return right;
        } else if (right.length == 0) {
            return left;
        }
        int item;
        int prevItem = 0;
        for (int rslIndex = 0; rslIndex < rsl.length; rslIndex++) {
            int itemPosition = 0;
            if (rslIndex < left.length) {
                item = left[rslIndex];
            } else {
                item = right[rslIndex - left.length];
            }
            for (int i = 0; i < left.length; i++) {
                if (left[i] < item) {
                    itemPosition++;
                }
            }
            for (int i = 0; i < right.length; i++) {
                if (right[i] < item) {
                    itemPosition++;
                }
            }
            if (prevItem == item) {
                itemPosition++;
            }
            rsl[itemPosition] = item;
            prevItem = item;
        }
        return rsl;
    }
}
