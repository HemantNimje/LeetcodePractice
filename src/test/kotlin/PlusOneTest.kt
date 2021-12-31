import org.junit.Assert.*
import org.junit.Test

class PlusOneTest {
    @Test
    fun testPlusOne() {
        val resultIntArray = PlusOne.Solution().plusOne(intArrayOf(1,2,3))
        assertEquals(1, resultIntArray[0])
        assertEquals(2, resultIntArray[1])
        assertEquals(4, resultIntArray[2])
    }

    @Test
    fun testPlusOne1() {
        val resultIntArray = PlusOne.Solution().plusOne(intArrayOf(4,3,2,1))
        assertEquals(4, resultIntArray[0])
        assertEquals(3, resultIntArray[1])
        assertEquals(2, resultIntArray[2])
        assertEquals(2, resultIntArray[3])
    }

    @Test
    fun testPlusOne2() {
        val resultIntArray = PlusOne.Solution().plusOne(intArrayOf(9))
        assertEquals(1, resultIntArray[0])
        assertEquals(0, resultIntArray[1])
    }
}