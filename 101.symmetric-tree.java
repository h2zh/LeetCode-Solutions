import java.util.Queue;

/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
 * https://leetcode.com/problems/symmetric-tree/description/
 *
 * algorithms
 * Easy (51.68%)
 * Likes:    9391
 * Dislikes: 233
 * Total Accepted:    1.2M
 * Total Submissions: 2.4M
 * Testcase Example:  '[1,2,2,3,4,4,3]'
 */

// @lc code=start

//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return help(root.left, root.right);

    }

    public boolean help(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.val != right.val)
            return false;
        return help(left.left, right.right) && help(left.right, right.left);
    }
}
// @lc code=end
