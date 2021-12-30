import org.junit.Assert.*
import org.junit.Test

class IsNumberPalindromeTest {
    @Test
    fun testIsNumberPalindrome() {
        assertEquals(true, IsNumberPalindrome.Solution().isPalindrome(121))
    }

    @Test
    fun testIsNumberPalindrome2() {
        assertEquals(false, IsNumberPalindrome.Solution().isPalindrome(123))
    }
}