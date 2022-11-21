package ru.job4j.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assertions.assertThat(result).containsExactly(expected);
    }
}