// LeetCode Problem: Jump Game
// Link: https://leetcode.com/problems/jump-game/
// Difficulty: Medium
// Language: java

class Solution {
    public boolean canJump(int[] nums) {

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            // Cannot even reach this index
            if (i > maxReach) {
                return false;
            }

            // Update the farthest place we can reach
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}