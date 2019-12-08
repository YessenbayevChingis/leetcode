package com.leetcode.easy

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
object ReverseInteger {
    @JvmStatic
    fun main(args: Array<String>) {
        val a = 10

     println(reverse(Int.MIN_VALUE))
        println(-1 * -1)

    }
    fun reverse(x: Int): Int {
        var searched = 0L
        if (x < 0) {
            searched = StringBuilder(x.times(-1L).toString()).reverse().toString().toLong()
        } else {
            searched = StringBuilder(x.toString()).reverse().toString().toLong()
        }
        if (searched > Int.MAX_VALUE || searched < Int.MIN_VALUE) return 0
        return if (x < 0) searched.times(-1).toInt() else searched.toInt()
    }
}