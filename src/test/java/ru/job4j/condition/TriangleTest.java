package ru.job4j.condition;

import org.assertj.core.api.Assertions;
import org.junit.Test;
public class TriangleTest {

    @Test
    public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assertions.assertThat(result).isTrue();
    }

    @Test
    public void whenNotExist() {
        double ab = 20.0;
        double ac = 40.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assertions.assertThat(result).isFalse();
    }
}