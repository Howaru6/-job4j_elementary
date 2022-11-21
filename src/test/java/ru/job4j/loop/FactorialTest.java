package ru.job4j.loop;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int n = 5;
        int out = Factorial.calc(n);
        Assertions.assertThat(out).isEqualTo(expected);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int n = 0;
        int out = Factorial.calc(n);
        Assertions.assertThat(out).isEqualTo(expected);
    }
}