package two_pointers

fun main() {
    val nums = intArrayOf(2, 7, 11, 15) // target = 9
    val nums2 = intArrayOf(3, 2, 4) // target = 6
    val nums3 = intArrayOf(3, 3) // target = 6


    val result = TwoSum1().twoSum(nums2, 6)
    println(result)
}

// Метод двух указателей работает только на отсортированном массиве
class TwoSum1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var left = 0
        var right = nums.size - 1

        nums.sort()
        while (left < right) {
            if (nums[left] + nums[right] == target) break
            if (nums[left] + nums[right] > target) {
                right--
            } else {
                left++
            }
        }
        return intArrayOf(left, right)
    }
}