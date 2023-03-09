package strings

fun main() {
    val s = "egg"
    val s2 = "add"

    val s3 = "foo"
    val s4 = "bar"

    val s5 = "paper"
    val s6 = "title"

    val s7 = "badc"
    val s8 = "baba"

    val result = IsomorphicStrings205().isIsomorphic(s, s2)
    println(result)
}

class IsomorphicStrings205 {
    private val stringMap = mutableMapOf<Char, Char>()
    fun isIsomorphic(s: String, t: String): Boolean {
        var str = charArrayOf()

        s.forEachIndexed { index, c ->
            str += stringMap[c] ?: putChar(c, t[index])
        }

        return (str.joinToString("") == t) && stringMap.values.size == hashSetOf(stringMap.values).size
    }

    private fun putChar(char: Char, valueChar: Char): Char {
        stringMap[char] = valueChar
        return valueChar
    }

// hashSetOf(stringMap.values)
// HashSet(stringMap.values)

    fun isIsomorphicV2(s: String, t: String): Boolean {
        val map = mutableMapOf<Char, Char>()

        s.forEachIndexed { index, c ->
            if (!map.containsKey(c) && !map.containsValue(t[index])) {
                map[c] = t[index]
            } else if (map[c] != t[index]) {
                return false
            }
        }

        return true
    }
}