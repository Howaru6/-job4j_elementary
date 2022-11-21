package ru.job4j.loop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        int number = 5;
        boolean result = CheckPrimeNumber.check(number);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = CheckPrimeNumber.check(number);
        Assertions.assertThat(result).isFalse();
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        Assertions.assertThat(result).isFalse();
    }
}