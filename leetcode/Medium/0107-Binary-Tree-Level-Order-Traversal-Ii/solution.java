// LeetCode Problem: Binary Tree Level Order Traversal II
// Link: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
// Difficulty: Medium
// Language: java

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<List<Integer>> res = new ArrayList<>();

    private void bfs(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {

            int n = q.size();
            List<Integer> level = new ArrayList<>();

            for(int x = 0; x < n; x++) {

                TreeNode curr = q.poll();
                
                // for next level
                if(curr.left != null)
                    q.offer(curr.left);

                if(curr.right != null)
                    q.offer(curr.right);

                level.add(curr.val);
            }
            
            // adding this level before the previous level 
            res.add(0, level);
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) 
            return res;

        bfs(root);

        return res;
    }
}