package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        for (int i = 0; i < post.length; i++) {
            int j = word.length + i - post.length;
            if (word[j] != post[i]) {
                return false;
            }
        }
        return true;
    }
}
