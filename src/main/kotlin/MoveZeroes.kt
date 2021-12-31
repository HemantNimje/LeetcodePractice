class MoveZeroes {
    class Solution {
        fun moveZeroes(nums: IntArray): IntArray {
            val resultArray = IntArray(nums.size)

            var resultArrayIndex = 0
            var zeroCount = 0
            for (i in nums.indices) {
                if (nums[i] == 0) {
                    zeroCount++
                } else {
                    resultArray[resultArrayIndex] = nums[i]
                    resultArrayIndex++
                }
            }

            for (i in 1 until zeroCount) {
                resultArray[resultArrayIndex] = 0
                resultArrayIndex++
            }
            return resultArray
        }
    }

    // for leetcode compiler
//    class Solution {
//        fun moveZeroes(nums: IntArray): Unit {
//            var resultArray = IntArray(nums.size)
//
//            var resultArrayIndex = 0
//            var zeroCount = 0
//            for(i in nums.indices){
//                if(nums[i] == 0){
//                    zeroCount++
//                } else {
//                    nums[resultArrayIndex] = nums[i]
//                    resultArrayIndex++
//                }
//            }
//
//            for(i in 1..zeroCount){
//                nums[resultArrayIndex] = 0
//                resultArrayIndex++
//            }
//        }
//    }
}