package dynamic_programming

fun main() {
    val nums = intArrayOf(10, 15, 20)
    val nums2 = intArrayOf(0, 0, 0, 0)
    val nums3 = intArrayOf(0, 1, 2, 2)
    val nums4 = intArrayOf(0, 10, 15, 20)
    val nums5 = intArrayOf(0, 1, 200, 2)
    val nums6 = intArrayOf(0, 400, 200, 2)

    val nums7 = intArrayOf(1, 100, 1, 1, 1, 100, 1, 1, 100, 1)

    val result = MinCostClimbingStairs746().minCostClimbingStairs(nums7)
    println(result)
}

class MinCostClimbingStairs746 {
    fun minCostClimbingStairs(cost: IntArray): Int {
        var prev1 = cost[0]
        var prev2 = cost[1]

        for (i in 2 until cost.size) {
            val minValue = min(cost[i] + prev2, cost[i] + prev1)
            prev1 = prev2
            prev2 = minValue
        }
        return min(prev2, prev1)
    }

    private fun min(first: Int, second: Int): Int = if (first < second) first else second
}