package two_pointers

class RemovePalindromicSubsequences1332 {
    fun removePalindromeSub(s: String): Int {
        var left = 0
        var right = s.length - 1
        var steps = 1

        while (left <= right) {
            if (s[left] != s[right]) {
                steps = 2
                break
            }
            left++
            right--
        }
        return steps
    }
}