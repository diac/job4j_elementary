package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {6, 3, 1, 4, 9, 2, 8, 7, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[] {5, 7, 8, 2, 9, 4, 1, 3, 6};
        assertThat(result).containsExactly(expected);
    }
}