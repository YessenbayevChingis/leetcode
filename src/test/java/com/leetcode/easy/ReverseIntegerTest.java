package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseIntegerTest {

    @Test
    void reverse1() {
        assertEquals(321, ReverseInteger.reverse(123));
    }

    @Test
    void reverse2() {
        assertEquals(-321, ReverseInteger.reverse(-123));
    }

    @Test
    void reverse3() {
        assertEquals(21, ReverseInteger.reverse(120));
    }
}