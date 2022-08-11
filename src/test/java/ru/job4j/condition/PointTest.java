package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12To55Then5() {
        double expected = 5;
        Point a = new Point(1, 2);
        Point b = new Point(5, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when55To12Then5() {
        double expected = 5;
        Point a = new Point(5, 5);
        Point b = new Point(1, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when45To88Then5() {
        double expected = 5;
        Point a = new Point(4, 5);
        Point b = new Point(8, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000To100Then1() {
        double expected = 1;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when050To000Then5() {
        double expected = 5;
        Point a = new Point(0, 5, 0);
        Point b = new Point(0, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}