/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        s = s.toLowerCase();
        while (left < right){
            // double check left<right to avoid left and right pointers match together
            // when the remainings are non-letter/non-digit like "ab?c ,-d ,?dcba" 
            while (left<right && !Character.isLetterOrDigit(s.charAt(left) ) ){
                left++;
            }
            while (left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        // String lower_s = s.toLowerCase();
        // String alphabetic = lower_s.replaceAll("[^0-9a-zA-Z]", "");
        // System.out.println(alphabetic);
        // for (int i=0; i<alphabetic.length() / 2 ; i++){
        //     if (alphabetic.charAt(i) != alphabetic.charAt(alphabetic.length() - 1 - i)){
        //         return false;
        //     }
        // }
        // return true;
    }
}
// @lc code=end

