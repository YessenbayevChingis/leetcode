package com.leetcode.easy;

//Determine whether an integer is a palindrome.
// An integer is a palindrome when it reads the same backward as forward.
//
//        Example 1:
//
//        Input: 121
//        Output: true
//
//        Example 2:
//
//        Input: -121
//        Output: false
//        Explanation: From left to right, it reads -121. From right to left,
//        it becomes 121-. Therefore it is not a palindrome.
//
//        Example 3:
//
//        Input: 10
//        Output: false
//        Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
//
//        Follow up:
//
//        Coud you solve it without converting the integer to a string?


public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(222222));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x / 10 == 0) {
            return true;
        }

        int size = (int) Math.ceil(Math.log10(x));
        int tempForFront = countOfZeroes(size - 1);


        if (x / tempForFront != x % 10) {
            return false;
        }

        tempForFront /= 10;
        int tempForEnd = 100;
        int tempForEnd2 = 10;


        for (int i = 1; i < size / 2; i++) {
            if (x / tempForFront % 10 != x % tempForEnd / tempForEnd2) {
                return false;
            }

            tempForFront /= 10;
            tempForEnd *= 10;
            tempForEnd2 *= 10;
        }
        return true;
    }

    public static boolean solutionFromLeetCode(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int result = 0;
        while (result < x) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        return x == result || x == result / 10;
    }

    private static int countOfZeroes(int count) {
        int result = 1;

        for (int i = 0; i < count; i++) {
            result *= 10;
        }

        return result;
    }
}
