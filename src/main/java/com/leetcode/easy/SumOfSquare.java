package com.leetcode.easy;

//Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.
//
//        Example 1:
//
//        Input: 5
//        Output: True
//        Explanation: 1 * 1 + 2 * 2 = 5
//
//
//
//        Example 2:
//
//        Input: 3
//        Output: False

public class SumOfSquare {
    public static void main(String[] args) {
        int c = 4;
        System.out.println(judgeSquareSum(c));
    }

    public static boolean judgeSquareSum(int c) {
        for (long i = 0; i * i <= c; i++) {
            double j = Math.sqrt(c - i * i);
            if (j == (int) j)
                return true;
        }
        return false;
    }

}
