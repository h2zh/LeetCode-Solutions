/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l<r){
            int sum =  numbers[l] + numbers[r];
            if (sum==target){
                return new int[]{l+1, r+1};
            }
            else if(sum > target){
                r--;
            }
            else if(sum < target){
                l++;
            }
        }
        return new int[]{-1,-1};
        // int[] result = new int[2];
        // for(int i=0; i<numbers.length; i++){
        //     for (int j=i+1; j<numbers.length; j++){
        //         if ( target == numbers[i] + numbers[j]){
        //             result[0] = i + 1;
        //             result[1] = j + 1;
        //             return result;
        //         }
        //     }
        // }
        // return null;
    }
}
// @lc code=end

