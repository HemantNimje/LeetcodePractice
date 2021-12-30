class RomanToInteger {
    class Solution {
        fun romanToInt(s: String): Int {
            var result = getRomanValue(s[s.length - 1])
            for(i in s.length - 2 downTo 0){
                if (getRomanValue(s[i]) < getRomanValue(s[i+1])){
                    result -= getRomanValue(s[i])
                } else {
                    result += getRomanValue(s[i])
                }
            }
            return result
        }


        private fun getRomanValue(c: Char): Int {
            return when(c) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> 0
            }
        }
    }
}