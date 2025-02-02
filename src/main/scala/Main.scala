// Uncomment a single block to run the function

// // Merge Sorted Array
// object Main extends App {
//   val nums1 = Array(1, 2, 3, 0, 0, 0)
//   val nums2 = Array(2, 5, 6)
//   MergeSortedArray.merge(nums1, 3, nums2, 3)
//   println(nums1.mkString(", "))
// }

// // Remove Element
// object Main extends App {
//   val nums = Array(3, 2, 2, 3)
//   val valueToRemove = 3
//   val k = RemoveElement.removeElement(nums, valueToRemove)
//   println(s"Length after removal: $k")
//   println("Modified array: " + nums.slice(0, k).mkString(", "))
// }

// // Remove Duplicates
// object Main extends App {
//   val nums = Array(0,0,1,1,1,2,2,3,3,4)
//   val k = RemoveDuplicates.removeDuplicates(nums)
//   println(s"Length after removal: $k")
//   println("Modified array: " + nums.slice(0, k).mkString(", "))
// }

// Remove Duplicates II
object Main extends App {
  val nums = Array(0,0,1,1,1,1,2,3,3)
  val k = RemoveDuplicatesII.removeDuplicates(nums)
  println(s"Length after removal: $k")
  println("Modified array: " + nums.slice(0, k).mkString(", "))
}
