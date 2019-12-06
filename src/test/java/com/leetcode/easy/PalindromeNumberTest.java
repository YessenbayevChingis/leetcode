package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    @Test
    void isPalindrome1() {
        assertTrue(PalindromeNumber.isPalindrome(121));
    }

    @Test
    void isPalindrome2() {
        assertFalse(PalindromeNumber.isPalindrome(-121));
    }

    @Test
    void isPalindrome3() {
        assertFalse(PalindromeNumber.isPalindrome(10));
    }
}