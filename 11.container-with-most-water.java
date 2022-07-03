/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int left_pointer = 0, right_pointer = height.length - 1;
        int area = 0;
        while(left_pointer < right_pointer){
            int curArea = (right_pointer - left_pointer) * Math.min(height[right_pointer], height[left_pointer]);
            area = Math.max(curArea, area);
            if(height[left_pointer] < height[right_pointer]) {
                left_pointer++;
            }else{
                right_pointer--;
            }
        }
        return area;
    }
}
// @lc code=end

