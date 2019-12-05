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
}