object RemoveDuplicatesII {
    def removeDuplicates(nums: Array[Int]): Int = {
        if (nums.length <= 2) return nums.length

        var k = 2 // STart at 2 since always keep the first two elements
        for (i <- 2 until nums.length) {
            if (nums(i) != nums(k - 2)) {
                nums(k) = nums(i)
                k+=1
            }
        }

        k
    }
}