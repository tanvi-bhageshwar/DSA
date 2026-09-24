# Rotting Oranges

**Difficulty:** Medium  
**Topics:** Array, Breadth-First Search, Matrix  
**LeetCode URL:** [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/)

## Problem Description

<p>You are given an <code>m x n</code> <code>grid</code> where each cell can have one of three values:</p>

<ul>
	<li><code>0</code> representing an empty cell,</li>
	<li><code>1</code> representing a fresh orange, or</li>
	<li><code>2</code> representing a rotten orange.</li>
</ul>

<p>Every minute, any fresh orange that is <strong>4-directionally adjacent</strong> to a rotten orange becomes rotten.</p>

<p>Return <em>the minimum number of minutes that must elapse until no cell has a fresh orange</em>. If <em>this is impossible, return</em> <code>-1</code>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2019/02/16/oranges.png" style="width: 650px; height: 137px;" />
<pre>
<strong>Input:</strong> grid = [[2,1,1],[1,1,0],[0,1,1]]
<strong>Output:</strong> 4
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> grid = [[2,1,1],[0,1,1],[1,0,1]]
<strong>Output:</strong> -1
<strong>Explanation:</strong> The orange in the bottom left corner (row 2, column 0) is never rotten, because rotting only happens 4-directionally.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> grid = [[0,2]]
<strong>Output:</strong> 0
<strong>Explanation:</strong> Since there are already no fresh oranges at minute 0, the answer is just 0.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>m == grid.length</code></li>
	<li><code>n == grid[i].length</code></li>
	<li><code>1 &lt;= m, n &lt;= 10</code></li>
	<li><code>grid[i][j]</code> is <code>0</code>, <code>1</code>, or <code>2</code>.</li>
</ul>

## Solution

```java
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
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
