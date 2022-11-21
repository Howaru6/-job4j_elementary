package ru.job4j.condition;

import org.assertj.core.api.Assertions;
import org.junit.Test;

    public class MaxTest {

        @Test
        public void whenMax1To2Then2() {
            int left = 1;
            int right = 2;
            int result = Max.max(left, right);
            int expected = 2;
            Assertions.assertThat(result).isEqualTo(expected);
        }

        @Test
        public void whenMax5To4Then5() {
            int left = 5;
            int right = 4;
            int result = Max.max(left, right);
            int expected = 5;
            Assertions.assertThat(result).isEqualTo(expected);
        }

        @Test
        public void whenMax5To6Then6() {
            int left = 5;
            int right = 6;
            int result = Max.max(left, right);
            int expected = 6;
            Assertions.assertThat(result).isEqualTo(expected);
        }

        @Test
        public void whenMax5To5Then5() {
            int left = 5;
            int right = 5;
            int result = Max.max(left, right);
            int expected = 5;
            Assertions.assertThat(result).isEqualTo(expected);
        }
    }