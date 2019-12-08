package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedStringMatchTest {

    @Test
    void test1() {
        assertEquals(3, RepeatedStringMatch.repeatedStringMatch("abcd", "cdabcdab"));
    }
}