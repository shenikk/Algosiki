package strings

fun main() {
    val s = "a"
    val s2 = "b"

    val s3 = "aa"
    val s4 = "ab"

    val s5 = "aa"
    val s6 = "aab"

    val result = RansomNote383().canConstruct(s5, s6)
    println(result)
}

class RansomNote383 {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val map = mutableMapOf<Char, Int>()
        magazine.forEach {
            map[it] = (map[it] ?: 0) + 1
        }
        ransomNote.forEach {
            if (map.containsKey(it) && map[it] != 0) {
                map[it] = (map[it] ?: 0) - 1
            } else {
                return false
            }
        }
        return true
    }
}