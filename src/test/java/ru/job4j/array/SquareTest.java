package ru.job4j.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        Assertions.assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        Assertions.assertThat(result).containsExactly(expected);
    }
}