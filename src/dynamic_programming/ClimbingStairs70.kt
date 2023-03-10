package dynamic_programming
fun main() {
    val result = ClimbingStairs70().climbStairs(5)
    println(result)
}

class ClimbingStairs70 {
    fun climbStairs(n: Int): Int {
        if (n < 3) return n
        val array = IntArray(n + 1)
        array[0] = 0
        array[1] = 1
        array[2] = 2

        for (i in 3 .. n) {
            array[i] = array[i-2] + array[i-1]
        }
        return array[n]
    }
}