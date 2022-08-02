package ru.job4j.condition;

import java.util.Calendar;

public class Greeting {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);

        idea += " But I am a newbie";

        final String year = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));

        idea += " " + year;

        System.out.println(idea);
    }
}
