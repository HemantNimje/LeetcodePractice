import org.junit.Assert.*
import org.junit.Test

class RomanToIntegerTest {
    @Test
    fun testRomanToInteger() {
        assertEquals(3, RomanToInteger.Solution().romanToInt("III"))
    }

    @Test
    fun testRomanToInteger2() {
        assertEquals(58, RomanToInteger.Solution().romanToInt("LVIII"))
    }

    @Test
    fun testRomanToInteger3() {
        assertEquals(1994, RomanToInteger.Solution().romanToInt("MCMXCIV"))
    }
}