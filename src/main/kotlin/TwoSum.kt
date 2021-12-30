class TwoSum {
    class Solution {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val compList = mutableListOf<Int>()
            val givenList = nums.toList()

            val result = mutableListOf<Int>()
            for (i in givenList.indices) {
                if (compList.contains(givenList[i])) {
                    val compValueIndex = compList.indexOf(givenList[i])
                    result.add(compValueIndex)
                    result.add(i)
                } else {
                    compList.add(target - givenList[i])
                }
            }
            return result.toIntArray()
        }
    }
}