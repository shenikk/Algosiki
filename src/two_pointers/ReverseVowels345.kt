package two_pointers

fun main() {
    val s = "hello"
    val s2 = "leetcode"
    val s3 = "."
    val s4 = "aA"
    val s5 = "A man, a plan, a canal: Panama"
    val s6 = "c#dc"
    val s7 = "ai"

    val result = ReverseVowels345().reverseVowels(s4)
    println(result)
}

class ReverseVowels345 {
    fun reverseVowels(s: String): String {
        val chars = s.toCharArray()
        val vowels =
            mapOf('a' to 1, 'e' to 1, 'i' to 1, 'o' to 1, 'u' to 1, 'A' to 1, 'E' to 1, 'I' to 1, 'O' to 1, 'U' to 1)

        var left = 0
        var right = chars.size - 1

        if (s.isBlank() || s.isEmpty()) return s

        while (left <= right) {
            while (vowels[chars[left]] == null) {
                left++
                if (left == chars.size) break
            }
            while (vowels[chars[right]] == null) {
                right--
                if (right <= 0) break
            }
            if (left < right) {
                val temp = chars[left]
                chars[left] = chars[right]
                chars[right] = temp
            }
            left++
            right--
        }

        return chars.joinToString("")
    }
}