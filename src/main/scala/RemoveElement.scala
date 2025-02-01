object RemoveElement {
    def removeElement(nums: Array[Int], `val`: Int): Int = {
        var k = 0
        for (i <- nums.indices) {
            if (nums(i) != `val`) {
                nums(k) = nums(i)
                k += 1
            }
        }
        k
    }
}