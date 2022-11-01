package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when50to20then3() {
        double expected = 3;
        int x1 = 5;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when73to25then5() {
        double expected = 5.38;
        int x1 = 7;
        int y1 = 3;
        int x2 = 2;
        int y2 = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then1() {
        double expected = 1.41;
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when77to22then7() {
        double expected = 7.07;
        int x1 = 7;
        int y1 = 7;
        int x2 = 2;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}