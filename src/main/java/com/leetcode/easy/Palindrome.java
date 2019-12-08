package com.leetcode.easy;

public class Palindrome {
    public  boolean isPalindrome(int x){ //TODO solution
        if (x < 0) return  false;
        int reversed = 0;
        int number = x;
        while (number >= 1) {
            reversed *=10;
            reversed+= number % 10;
            number = (number - number % 10) / 10;
        }
        return x - reversed == 0;
    }
}
