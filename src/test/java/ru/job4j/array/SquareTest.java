package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SquareTest {

    @Test
    public void whenBound4Then0149() {
        int bound = 4;
        int[] result = Square.calculate(bound, 2);
        int[] expected = new int[] {0, 1, 4, 9};
        Assert.assertArrayEquals(expected, result);
    }
}