class TwoSum {
    class Solution {
        fun twoSum(array: MutableList<Int>, targetSum: Int): List<Int> {
            val complementNumbersArray = mutableListOf<Int>()

            for (i in 0 until array.size) {
                if (isAlreadyPresent(complementNumbersArray, array[i])) {
                    return listOf(array[i], targetSum - array[i])
                } else {
                    complementNumbersArray.add(targetSum - array[i])
                }
            }

            return listOf()
        }

        private fun isAlreadyPresent(array: MutableList<Int>, currentValue: Int): Boolean {
            return array.contains(currentValue)
        }
    }
}