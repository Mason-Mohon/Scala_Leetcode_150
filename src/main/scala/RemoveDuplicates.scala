object RemoveDuplicates {
    def removeDuplicates(nums: Array[Int]): Int = {
        if (nums.isEmpty) return 0

        var k = 1 // start from index 1 for the unique pointer
        for (i <- 1 until nums.length) {
            if (nums(i) != nums(k-1)) {
                nums(k) = nums(i)
                k += 1
            }
        }
        k
    }
}