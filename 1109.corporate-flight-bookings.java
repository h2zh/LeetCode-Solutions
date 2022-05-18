/*
 * @lc app=leetcode id=1109 lang=java
 *
 * [1109] Corporate Flight Bookings
 * https://leetcode.com/problems/corporate-flight-bookings/description/
 *
 * algorithms
 * Medium (58.88%)
 * Likes:    1040
 * Dislikes: 141
 * Total Accepted:    39.5K
 * Total Submissions: 67.1K
 * Testcase Example:  '[[1,2,10],[2,3,20],[2,5,25]]\n5'
 */

// @lc code=start
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        // create an array representing reserved seats
        int[] reserved = new int[n];
        // create a diff array
        int[] dif = new int[reserved.length];
        dif[0] = reserved[0];
        for (int i = 1; i < dif.length; i++) {
            dif[i] = reserved[i] - dif[i - 1];
        }
        // manipulate on the diff array
        for (int[] update : bookings) {
            int i = update[0] - 1; // change flight labels 1-5 to index 0-4
            int j = update[1] - 1;
            int val = update[2];
            dif[i] += val;
            if (j < dif.length - 1) {
                // if j>=4, then you don't need to make dif[j+1] minus val,
                // bc every num from i to the end will add val.
                dif[j + 1] -= val;
            }
        }
        // reverse to the new array
        int[] result = new int[dif.length];
        result[0] = dif[0];
        for (int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] + dif[i];
        }
        return result;
    }
}
// @lc code=end
