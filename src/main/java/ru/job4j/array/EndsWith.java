package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        if (post.length > word.length) {
            return false;
        }

        for (int i = post.length - 1; i >= 0; i--) {
            int j = word.length + i - post.length;
            if (word[j] != post[i]) {
                return false;
            }
        }

        return true;
    }
}
