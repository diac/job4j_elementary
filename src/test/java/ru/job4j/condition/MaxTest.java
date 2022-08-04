package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10ToMax999Then999() {
        int left = 10;
        int right = 999;
        int result = Max.max(left, right);
        int expected = 999;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax100To1Then100() {
        int left = 100;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax33To33Then33() {
        int left = 33;
        int right = 33;
        int result = Max.max(left, right);
        int expected = 33;
        assertThat(result).isEqualTo(expected);
    }
}