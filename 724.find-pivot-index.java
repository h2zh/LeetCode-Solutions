/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 * https://leetcode.com/problems/find-pivot-index/description/
 *
 * algorithms
 * Easy (51.72%)
 * Likes:    3217
 * Dislikes: 374
 * Total Accepted:    313K
 * Total Submissions: 604.3K
 * Testcase Example:  '[1,7,3,6,5,6]'
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        // construct preSum array
        int[] preSum = new int[nums.length + 1];
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
        // DEBUG: print preSum array
        for (int i = 0; i < preSum.length; i++) {
            System.out.print(preSum[i] + " ");
        }

        // find the pivot on preSum array
        for (int i = 1; i < preSum.length; i++) {
            int leftSum = preSum[i - 1] - preSum[0];
            int rightSum = preSum[preSum.length - 1] - preSum[i];
            if (leftSum == rightSum) {
                return i - 1; // reverse to original pivot index
            }
        }
        return -1;
    }
}
// @lc code=end
