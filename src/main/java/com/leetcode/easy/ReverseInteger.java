package com.leetcode.easy;

//Given a 32-bit signed integer, reverse digits of an integer.
//
//        Example 1:
//
//        Input: 123
//        Output: 321
//
//        Example 2:
//
//        Input: -123
//        Output: -321
//
//        Example 3:
//
//        Input: 120
//        Output: 21
//
//        Note:
//        Assume we are dealing with an environment which could only store integers
//        within the 32-bit signed integer range: [−2^31,  2^31 − 1].
//        For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.


public class ReverseInteger {

    public static void main(String[] args) {
        int a = 1534236469;
        System.out.println(reverse(a));
    }

    public static int reverse(int x) {
        boolean isNegative = x < 0;
        x = isNegative ? x * -1 : x;
        x = x % 10 == 0 ? x / 10 : x;
        StringBuilder result = new StringBuilder(String.valueOf(x));
        result = result.reverse();
        try {
            return isNegative ? -1 * Integer.parseInt(result.toString()) : Integer.parseInt(result.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
