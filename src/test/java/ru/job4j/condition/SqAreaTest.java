package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        double k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K3Square1dot68() {
        int p = 6;
        double k = 3;
        double expected = 1.68;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}