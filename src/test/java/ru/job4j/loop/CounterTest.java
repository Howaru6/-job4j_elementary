package ru.job4j.loop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromZeroToFiveThenFifteen() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    public static class MainTest {
        @Test
        public void whenActionThenResult() {
            int excepted = 1;
            int result = 1;
            assertThat(result).isEqualTo(excepted);
        }
    }
}