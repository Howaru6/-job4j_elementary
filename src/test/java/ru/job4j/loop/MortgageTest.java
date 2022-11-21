package ru.job4j.loop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MortgageTest {

    @Test
    public void whenAmount1000Salary1200Percent1ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 1;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenAmount100Salary120Percent50ThenYear2() {
        int amount = 100;
        int salary = 120;
        double percent = 50;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 2;
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenAmount1000Salary1200Percent20ThenYear1() {
        int amount = 1000;
        int salary = 1200;
        double percent = 20;
        int result = Mortgage.year(amount, salary, percent);
        int expected = 1;
        Assertions.assertThat(result).isEqualTo(expected);
    }
}