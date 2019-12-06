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

    public static int solutionFromLeetCode(int x) {
        int result = 0;

        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }

            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }

            result = result * 10 + pop;
        }

        return result;
    }

    public static int fastestSolutionFromLeetCode(int x) {
        long result = 0;

        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;

            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) result;
    }
}
