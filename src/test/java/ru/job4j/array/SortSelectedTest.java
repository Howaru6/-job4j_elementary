package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort5Items() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5ItemsAgain() {
        int[] data = new int[] {9, 14, 7, 0, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 5, 7, 9, 14};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Items() {
        int[] data = new int[] {7, 9, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 7, 9};
        assertThat(result).containsExactly(expected);
    }
}