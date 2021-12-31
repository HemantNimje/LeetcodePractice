class BestTimeToBuyAndSellStock {
    class Solution {
        fun maxProfit(prices: IntArray): Int {
            var min = prices[0]
            var max = prices[0]
            var result = 0
            for (i in 0 until prices.size) {
                if (min > prices[i]) {
                    min = prices[i]
                    max = 0
                }
                if (max < prices[i]) {
                    max = prices[i]
                }
                if (max > min && result < (max - min)) {
                    result = max - min
                }
            }
            return result
        }
    }
}