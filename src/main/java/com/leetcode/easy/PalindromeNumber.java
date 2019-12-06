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
//        System.out.println(123 / 100);
        int data = 1221;
        System.out.println(isPalindrome(data));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x / 10 == 0) {
            return true;
        }

        int stepFromEnd = sizeOfDigit(x) / 10;
        int stepFromFront = sizeOfDigit(x);


        if (x / stepFromFront != x % stepFromEnd) {
            System.out.println(x / stepFromFront);
            System.out.println(x % stepFromEnd);
            return false;
        }

        stepFromFront /= 10;
        stepFromEnd *= 10;

        int temp = 10;
        for (int i = 1; i < x / 2; i++) {
            if (x / stepFromFront % temp != x % stepFromEnd / temp) {
                System.out.println(x / stepFromFront % temp);
                System.out.println(x % stepFromEnd / temp);
                System.out.println(i);
                return false;
            }
        }


        return true;
    }

    private static int sizeOfDigit(int digit) {
        int result = 1;

        for (int i = 0; digit != 0; ++i) {
            digit /= 10;
            result *= 10;
        }

        return result / 10;
    }
}
