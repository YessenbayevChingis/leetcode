package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SumOfSquareTest {

    @Test
    void judgeSquareSum() {
        int data = 5;

        boolean actual = SumOfSquare.judgeSquareSum(data);

        assertTrue(actual);
    }

    @Test
    void judgeSquareSum2() {
        int data = 3;

        boolean actual = SumOfSquare.judgeSquareSum(data);

        assertFalse(actual);
    }

    @Test
    void judgeSquareSum3() {
        int data = 8;

        boolean actual = SumOfSquare.judgeSquareSum(data);

        assertTrue(actual);
    }

    @Test
    void judgeSquareSum4() {
        int data = 1000000000;

        boolean actual = SumOfSquare.judgeSquareSum(data);

        assertTrue(actual);
    }

    @Test
    void judgeSquareSum5() {
        int data = 9;

        boolean actual = SumOfSquare.judgeSquareSum(data);

        assertTrue(actual);
    }

    @Test
    void judgeSquareSum6() {
        int data = 1;

        boolean actual = SumOfSquare.judgeSquareSum(data);

        assertTrue(actual);
    }
}