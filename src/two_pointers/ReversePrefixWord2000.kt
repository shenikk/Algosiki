package two_pointers

fun main() {
    val s = "abcdefd"
    val s2 = "acba"
    val s3 = "cbbcc"

    val result = ReversePrefixWord2000().reversePrefix(s, 'd')
    println(result)
}

class ReversePrefixWord2000 {
    fun reversePrefix(word: String, ch: Char): String {
        val newWord = word.toCharArray()
        var left = 0
        var right = 0
        var buffer: Char

        for (i in word.indices) {
            if (word[i] == ch) {
                right = i
                break
            }
        }
        while (left < right) {
            buffer = newWord[left]
            newWord[left] = newWord[right]
            newWord[right] = buffer
            left++
            right--
        }
        return newWord.joinToString("")
    }
}