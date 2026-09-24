// LeetCode Problem: Gas Station
// Link: https://leetcode.com/problems/gas-station/
// Difficulty: Medium
// Language: java

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int total = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {

            // int diff = gas[i] - cost[i];

            total = total+ gas[i] - cost[i];
            tank =tank + gas[i] - cost[i];

            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (total < 0) {
            return -1;
        }

        return start;
    }
}