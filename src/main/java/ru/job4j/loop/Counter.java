package ru.job4j.loop;

public class Counter {

    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <=  finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum: ");
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
        System.out.println(sum(-4, 4));
        System.out.println(sum(-2, 18));
        System.out.println(sum(3, 33));
        System.out.println(sum(-25, 0));
        System.out.println("\n");

        System.out.println("Sum by even:");
        System.out.println(sumByEven(2, 15));
        System.out.println(sumByEven(-4, 6));
        System.out.println(sumByEven(3, 3));
        System.out.println(sumByEven(3, 5));
    }
}
