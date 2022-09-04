// Practicing LeetCode Problems

import UIKit

// MARK: Problem 1


//class Solution {
//    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
//        var answer = [Int]()
//
//        for m in 0..<nums.count {
//            for n in (m+1)..<nums.count {
//                if (nums[m] + nums[n]) == target {
//                    answer.append(m)
//                    answer.append(n)
//
//                }
//            }
//        }
//        return answer
//    }
//}
//
//var ans = Solution()
//ans.twoSum([3,3,3], 6)

// MARK: Problem 2



// Definition for singly-linked list.

  public class ListNode {
      public var val: Int
      public var next: ListNode?
      public init() { self.val = 0; self.next = nil; }
      public init(_ val: Int) { self.val = val; self.next = nil; }
      public init(_ val: Int, _ next: ListNode?) { self.val = val; self.next = next; }
  }
 
class Solution {
    func addTwoNumbers(_ l1: ListNode?, _ l2: ListNode?) -> ListNode? {
        var answer = ListNode()
        
        return answer
        
    }
}
