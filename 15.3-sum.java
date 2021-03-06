/*
 * @lc app=leetcode id=15 lang=java
 *
 * [15] 3Sum
 */

// @lc code=start
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // O(n^2)
        List<List<Integer>> triplets = new ArrayList();
        
        for(int i=0; i<nums.length-2; i++){
            if(i==0 || i>0 && (nums[i] != nums[i-1])){
                int low = i+1, high = nums.length-1;
                int sum = 0 - nums[i];
                while(low<high){
                    if(nums[low] + nums[high] == sum){
                        triplets.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        // skip duplicates
                        while(low<high && nums[low]==nums[low+1]) low++;
                        while(low<high && nums[high]==nums[high-1]) high--;
                        // regular iteration
                        low++;
                        high--;
                    }else if(nums[low] + nums[high] < sum){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }
        return triplets;
    }
}
// @lc code=end

