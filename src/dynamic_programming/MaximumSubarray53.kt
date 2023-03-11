package dynamic_programming

fun main() {
    val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4) // The subarray [4,-1,2,1] has the largest sum 6.
    val nums2 = intArrayOf(1) // The subarray [1] has the largest sum 1.
    val nums3 = intArrayOf(5, 4, -1, 7, 8) // The subarray [5,4,-1,7,8] has the largest sum 23.
    val nums4 = intArrayOf(-2, 1, -1, 2)
    val nums5 = intArrayOf(-2, -1)
    val nums6 = intArrayOf(1, 2)

    val result = MaximumSubarray53().maxSubArray(nums)
    println(result)
}

class MaximumSubarray53 {
    // определение подзадачи
    // определение базы
    // вывод формулы перехода
    fun maxSubArray(nums: IntArray): Int {
        if (nums.size == 1) return nums.first()

        val arr = IntArray(nums.size)
        arr[0] = nums.first()
        for (i in 1 until nums.size) {
            if (nums[i] > nums[i] + arr[i - 1]) {
                arr[i] = nums[i]
            } else {
                arr[i] = nums[i] + arr[i - 1]
            }

        }

        return getMax(arr)
    }

    private fun getMax(arr: IntArray): Int {
        var res = arr.first()
        arr.forEach {
            if (it > res) res = it
        }
        return res
    }


    fun maxSubArrayTest(nums: IntArray): Int {
        if (nums.size == 1) return nums.first()
        if (nums.size == 2) {

            // -2 -1
            // 2 -1
            // -2 1
            // 2 1
            val maxValue = maxOf(nums[0], nums[1])
            val minValue = minOf(nums[0], nums[1])

            return if ((maxValue + minValue) <= maxValue) {
                maxValue
            } else {
                maxValue + minValue
            }
        }


        val arr = IntArray(nums.size + 1)
        arr[0] = nums.first()
        val res = 0
        for (i in 1 until nums.size) {
//            val maxValue = maxOf(nums[i - 1], nums[i])
//            val minValue = minOf(nums[i - 1], nums[i])
//
//            val r = if ((maxValue + minValue) <= maxValue) {
//                maxValue
//            } else {
//                maxValue + minValue
//            }
//
//            if (r < res) {
//                res = nums[i-1]
//            } else {
//                res += r
//            }


//            if ((nums[i - 1] + nums[i - 2]) < nums[i]) {
//                if (res < nums[i]) {
//                    res = nums[i]
//                }
//            } else {
//                res += nums[i]
//            }

            if (nums[i] > arr[i - 1]) {
                arr[i] = nums[i]
            } else {
                arr[i] = nums[i] + arr[i - 1]
            }

        }

        return arr.max()
    }
}