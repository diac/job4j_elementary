package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayWith3Items() {
        int[] data = new int[] {1000, 10, 100};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 100, 1000};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArrayWith5Items() {
        int[] data = new int[] {23, 8, 4, 16, 15};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 8, 15, 16, 23};
        assertThat(result).containsExactly(expected);
    }
}