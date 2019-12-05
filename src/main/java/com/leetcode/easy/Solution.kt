package com.leetcode.easy

import kotlin.math.sqrt

class Solution {
    fun judgeSquareSum(c: Int): Boolean {
        if (c == 0 || c == 1) return true
        var start = 1
        var sqt = sqrt((c).toDouble()) + 1
        while (start < sqt)  {
            sqt = sqrt((c - start*start).toDouble())
            val decimal = sqt.toInt()
            val fraction = sqt - decimal
            start++
            if (fraction == 0.0) return true
        }
        return false
    }
}