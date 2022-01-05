import org.junit.Assert.*
import org.junit.Test

class TwoSumTest {
    @Test
    fun testTwoSum() {
        assertEquals(0, TwoSum.Solution().twoSum(mutableListOf(0,4,3,0), 0)[0])
        assertEquals(0, TwoSum.Solution().twoSum(mutableListOf(0,4,3,0), 0)[1])
    }

    @Test
    fun testTwoSum2() {
        assertEquals(7, TwoSum.Solution().twoSum(mutableListOf(2,7,11,15), 9)[0])
        assertEquals(2, TwoSum.Solution().twoSum(mutableListOf(2,7,11,15), 9)[1])
    }
}