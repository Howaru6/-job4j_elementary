package ru.job4j.loop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int finish = 5;
        int result = PrimeNumber.calc(finish);
        int expected = 3;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when11() {
        int finish = 11;
        int result = PrimeNumber.calc(finish);
        int expected = 5;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when2() {
        int finish = 2;
        int result = PrimeNumber.calc(finish);
        int expected = 1;
        Assertions.assertThat(result).isEqualTo(expected);
    }
}