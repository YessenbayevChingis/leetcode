package com.leetcode.easy

import kotlin.math.sqrt
/*
Perfomance the same seems as #1 Solution
that java code has some advantages towards kotlin
*/

class SolutionRefactor {
    fun judgeSquareSum(c: Int): Boolean {
        var start = 0
        while ((start * start) < c) {
            val diff = c - start * start
            val koren = sqrt(diff.toDouble())
            if (koren - koren.toInt() == 0.0) return true
            start++
        }
        return false
    }
}