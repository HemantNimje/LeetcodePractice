class IsNumberPalindrome {
    class Solution {
        fun isPalindrome(x: Int): Boolean {
            var givenNumber = x
            var reverseNumber = 0

            while (givenNumber > 0) {
                val temp = givenNumber % 10
                reverseNumber = (reverseNumber * 10) + temp
                givenNumber /= 10
            }

            return reverseNumber - x == 0
        }
    }
}