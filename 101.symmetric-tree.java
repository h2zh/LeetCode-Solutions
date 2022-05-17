import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

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
            return false;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);
        while (!q.isEmpty()) {
            TreeNode l = q.poll();
            TreeNode r = q.poll();
            if (l == null && r == null)
                continue; // jump to next while loop
            if ((l == null && r != null) || (l != null && r == null))
                return false;
            if (l.val != r.val)
                return false;
            
            q.offer(l.left);
            q.offer(r.right);
            q.offer(l.right);
            q.offer(r.left);
        }
        return true;
    }    

}
// @lc code=end
