package two_pointers

fun main() {
    val s = "abca"
    val s2 = "acba"
    val s3 = "cbbcc"
    val s4 = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"
    val s5 = "ebcbb e cecabbace c bbcbe"
    val s6 = "deeee"
    val s7 = "atbbga"

    val result = ValidPalindromeII680().validPalindrome(s7)
    println(result)
}

class ValidPalindromeII680 {
    fun validPalindrome(s: String): Boolean {
        return isPalindrome(s, 0, s.lastIndex, false)
    }

    private fun isPalindrome(s: String, left: Int, right: Int, isDeleted: Boolean): Boolean {
        var l = left
        var r = right
        while (l < r) {
            if (s[l] != s[r]) {
                if (isDeleted) return false
                return isPalindrome(s, l + 1, r, true) || isPalindrome(s, l, r - 1, true)
            }
            l++
            r--
        }
        return true
    }
}