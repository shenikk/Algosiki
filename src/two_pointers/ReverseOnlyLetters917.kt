package two_pointers

fun main() {
    val s = "ab-cd"
    val s2 = "race a car"
    val s3 = " "

    val result = ReverseOnlyLetters917().reverseOnlyLetters(s)
    println(result)
}

class ReverseOnlyLetters917 {
    fun reverseOnlyLetters(s: String): String {
        var left = 0
        var right = s.lastIndex
        val newS = s.toCharArray()

        while (left < right) {
            if (checkChar(newS[left]) && checkChar(newS[right])) {
                val buffer = s[left]
                newS[left] = newS[right]
                newS[right] = buffer

                left++
                right--
            } else {
                if (!checkChar(newS[left])) {
                    left++
                } else {
                    right--
                }
            }
        }
        return newS.joinToString("")
    }

    private fun checkChar(c: Char): Boolean = c.isLetter()
}