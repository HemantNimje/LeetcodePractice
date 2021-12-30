import org.junit.Assert.*
import org.junit.Test

class TwoSumTest {
    @Test
    fun testTwoSum() {
        assertEquals(0, TwoSum.Solution().twoSum(intArrayOf(0,4,3,0), 0)[0])
        assertEquals(3, TwoSum.Solution().twoSum(intArrayOf(0,4,3,0), 0)[1])
    }

    @Test
    fun testTwoSum2() {
        assertEquals(0, TwoSum.Solution().twoSum(intArrayOf(2,7,11,15), 9)[0])
        assertEquals(1, TwoSum.Solution().twoSum(intArrayOf(2,7,11,15), 9)[1])
    }
}