package two_pointers

fun main() {
    val nums = intArrayOf(1, 0, 2, 3, 0, 4, 5, 0) // 1,0,0,2,3,0,0,4
    val nums2 = intArrayOf(1, 2, 3) // 1,2,3

    val result = DuplicateZeros1089().duplicateZeros(nums2)
    println(result)
}

class DuplicateZeros1089 {
    fun duplicateZeros(arr: IntArray) {
        var left = 0

        while (left < arr.size - 1) {
            if (arr[left] == 0) {
                shift(arr, left)
                left++
            }
            left++
        }
    }

    private fun shift(arr: IntArray, left: Int) {
        for (i in arr.size - 2 downTo left) {
            arr[i + 1] = arr[i]
            if (arr[i] == 0) continue
        }
    }
}