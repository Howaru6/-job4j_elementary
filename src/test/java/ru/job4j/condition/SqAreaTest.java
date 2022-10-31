package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void whenP15K5Square7() {
        int expected = 7;
        int p = 15;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void whenP20K8Square9() {
        int expected = 9;
        int p = 20;
        double k = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void whenP55K15Square44() {
        int expected = 44;
        int p = 55;
        double k = 15;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}