package ru.job4j.array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assertions.assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArrayAgain() {
        int[] input = new int[]{3, 5, 9, 4};
        int[] result = Turn.back(input);
        int[] expected = new int[]{4, 9, 5, 3};
        Assertions.assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        Assertions.assertThat(result).containsExactly(expected);
    }
}
