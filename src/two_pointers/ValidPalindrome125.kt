package two_pointers

fun main() {
    val s = "A man, a plan, a canal: Panama"
    val s2 = "race a car"
    val s3 = " "


    val result = ValidPalindrome125().isPalindrome(s)
    println(result)
}

class ValidPalindrome125 {
    fun isPalindrome(s: String): Boolean {
        val formattedS = s.replace("[^A-Za-z0-9]".toRegex(), "").lowercase()
        var res = true
        var left = 0
        var right = formattedS.lastIndex

        while (left <= right) {
            if (formattedS[left] == formattedS[right]) {
                left++
                right--
                res = true
            } else {
                res = false
                break
            }
        }

        return res
    }
}