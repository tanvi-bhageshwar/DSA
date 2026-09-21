// LeetCode Problem: Number of Islands
// Link: https://leetcode.com/problems/number-of-islands/
// Difficulty: Medium
// Language: java

class Solution {

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int res = 0;

        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1' && !vis[i][j]) {
                    DFS(grid, n, m, i, j, vis);
                    res++;
                }
            }
        }

        return res;
    }

    public void DFS(char[][] grid, int n, int m,
                    int i, int j, boolean[][] vis) {

        vis[i][j] = true;

        int[] x = {-1, 1, 0, 0};
        int[] y = {0, 0, -1, 1};

        for (int k = 0; k < 4; k++) {

            int row = i + x[k];
            int col = j + y[k];

            if (valid(row, col, n, m)
                    && grid[row][col] == '1'
                    && !vis[row][col]) {

                DFS(grid, n, m, row, col, vis);
            }
        }
    }

    public boolean valid(int i, int j, int n, int m) {

        if (i < 0 || i >= n || j < 0 || j >= m) {
            return false;
        }

        return true;
    }
}