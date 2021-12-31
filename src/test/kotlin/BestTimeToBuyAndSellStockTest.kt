import org.junit.Assert.*
import org.junit.Test

class BestTimeToBuyAndSellStockTest {
    @Test
    fun testBestTimeToBuyAndSellStock() {
        assertEquals(5, BestTimeToBuyAndSellStock.Solution().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4)))
    }

    @Test
    fun testBestTimeToBuyAndSellStock1() {
        assertEquals(0, BestTimeToBuyAndSellStock.Solution().maxProfit(intArrayOf(7, 6, 4, 3, 1)))
    }

    @Test
    fun testBestTimeToBuyAndSellStock2() {
        assertEquals(2, BestTimeToBuyAndSellStock.Solution().maxProfit(intArrayOf(2, 4, 1)))
    }

    @Test
    fun testBestTimeToBuyAndSellStock3() {
        assertEquals(4, BestTimeToBuyAndSellStock.Solution().maxProfit(intArrayOf(3,2,6,5,0,3)))
    }
}