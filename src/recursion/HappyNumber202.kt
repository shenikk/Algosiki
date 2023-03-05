package recursion

fun main() {
    val result = HappyNumber202().isHappy(1111111)
    println(result)
}

class HappyNumber202 {
    fun isHappy(n: Int): Boolean {
        var res = n
        var temp = 0

        while (res > 0) {
            val num = res % 10
            res /= 10
            temp += num * num
        }

        return if (temp / 10 == 0) {
            if (temp == 7) return true
            temp == 1
        } else {
            isHappy(temp)
        }
    }
}