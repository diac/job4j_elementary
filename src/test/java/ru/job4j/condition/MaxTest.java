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

    @Test
    public void whenMax100To1000To10Then100() {
        int x1 = 100;
        int x2 = 1000;
        int x3 = 10;
        int result = Max.max(x1, x2, x3);
        int expected = 1000;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1To4To3Then4() {
        int x1 = 2;
        int x2 = 1;
        int x3 = 4;
        int x4 = 3;
        int result = Max.max(x1, x2, x3, x4);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}