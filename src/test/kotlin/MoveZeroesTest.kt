import org.junit.Assert.*
import org.junit.Test

class MoveZeroesTest {
    @Test
    fun testMoveZeros() {
        assertEquals(1, MoveZeroes.Solution().moveZeroes(intArrayOf(0,1,0,3,12))[0])
        assertEquals(3, MoveZeroes.Solution().moveZeroes(intArrayOf(0,1,0,3,12))[1])
        assertEquals(12, MoveZeroes.Solution().moveZeroes(intArrayOf(0,1,0,3,12))[2])
        assertEquals(0, MoveZeroes.Solution().moveZeroes(intArrayOf(0,1,0,3,12))[3])
        assertEquals(0, MoveZeroes.Solution().moveZeroes(intArrayOf(0,1,0,3,12))[4])
    }

    @Test
    fun testMoveZeros1() {
        assertEquals(0, MoveZeroes.Solution().moveZeroes(intArrayOf(0))[0])
    }
}