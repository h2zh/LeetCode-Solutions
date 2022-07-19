/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        int low=0, high=s.length()-1;
        while(low<high){
            if (s.charAt(low) != s.charAt(high)){
                return helperMethod(s, low+1, high) || helperMethod(s, low, high-1);
            }
            low++;
            high--;
        }
        return true;
    }

    public boolean helperMethod(String s, int i, int j) {
        int low=i, high=j;
        while(low<high){
            if (s.charAt(low) != s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}
// @lc code=end

