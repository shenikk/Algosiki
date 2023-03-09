package strings

fun main() {
    val s = "abba"
    val s2 = "dog cat cat dog"
    val s3 = "dog cat cat fish"

    val s4 = "aaaa"
    val s5 = "dog cat cat dog"

    val s6 = "aaa"
    val s7 = "aa aa aa aa"

    val result = WordPattern290().wordPattern(s4, s5)
    println(result)
}

class WordPattern290 {
    fun wordPattern(pattern: String, s: String): Boolean {
        val map = mutableMapOf<Char, String>()
        val result = s.split(" ").map { it.trim() }

        if (pattern.toCharArray().size != result.size) return false

        pattern.forEachIndexed { index, c ->
            if (!map.containsKey(c) && !map.containsValue(result[index])) {
                map[c] = result[index]
            } else if (map[c] != result[index]) {
                return false
            }
        }
        return true
    }
}