package recursion

fun main() {
    val nums = intArrayOf(2, 4, 6)
    val nums2 = intArrayOf(2, 4, 6, 1, 0)
    val nums3 = intArrayOf(2, 4, 6, 1, 0, 9, 1, 2, 5)

//    val result = sum(0, nums)
    val result = maxNum(0, nums3)
    println(result)
}

fun sum(i: Int, arr: IntArray): Int {
    if (arr.isEmpty()) return 0

    return if (i == arr.size - 1) {
        return arr[i]
    } else {
        arr[i] + sum(i + 1, arr)
    }
}

fun maxNum(i: Int, arr: IntArray): Int {

    if (arr.isEmpty()) return 0

    return if (i == arr.size - 1) {
        arr[i]
    } else {
        val res = maxNum(i + 1, arr)
        if (arr[i] > res) arr[i] else res
    }
}