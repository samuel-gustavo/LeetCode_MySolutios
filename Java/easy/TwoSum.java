// LeetCode 1: Two Sum
// https://leetcode.com/problems/two-sum/
// Runtime: 45 ms
// Memory: 46,17 MB

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(target == (nums[i] + nums[j])) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
