// LeetCode Problem: Rotting Oranges
// Link: https://leetcode.com/problems/rotting-oranges/
// Difficulty: Medium
// Language: java

import java.util.*;

class Solution {

    // Checks whether a cell is inside the grid
    public boolean valid(int i, int j, int n, int m) {
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }
        return true;
    }

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        // Queue stores coordinates of rotten oranges
        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;
        int time = 0;

        // Put all rotten oranges into queue initially
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
                else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // 4 possible directions
        int[][] directions = {
            {-1, 0},  // up
            {1, 0},   // down
            {0, -1},  // left
            {0, 1}    // right
        };

        // BFS
        while (!q.isEmpty() && fresh > 0) {

            int size = q.size();

            // Process one complete level = one minute
            for (int s = 0; s < size; s++) {

                int[] p = q.poll();

                int row = p[0];
                int col = p[1];

                // Check all 4 neighbours
                for (int k = 0; k < 4; k++) {

                    int newRow = row + directions[k][0];
                    int newCol = col + directions[k][1];

                    if (valid(newRow, newCol, n, m)
                            && grid[newRow][newCol] == 1) {

                        // Fresh orange becomes rotten
                        grid[newRow][newCol] = 2;

                        fresh--;

                        // Add newly rotten orange to queue
                        q.offer(new int[]{newRow, newCol});
                    }
                }
            }

            time++;
        }

        // If fresh oranges are still left, they cannot be reached
        if (fresh > 0) {
            return -1;
        }

        return time;
    }
}