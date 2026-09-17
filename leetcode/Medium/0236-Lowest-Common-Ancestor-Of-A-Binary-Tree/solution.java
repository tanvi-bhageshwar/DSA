// LeetCode Problem: Lowest Common Ancestor of a Binary Tree
// Link: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// Difficulty: Medium
// Language: java

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    TreeNode ans = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        findLCA(root, p, q);

        return ans;
    }

    public int findLCA(TreeNode node, TreeNode p, TreeNode q) {

        // Base case
        if (node == null) {
            return 0;
        }

        // Find in left subtree
        int left = findLCA(node.left, p, q);

        // Find in right subtree
        int right = findLCA(node.right, p, q);

        // Check current node
        int self = 0;

        if (node == p || node == q) {
            self = 1;
        }

        // Total number of p/q found
        int total = left + self + right;

        // Both p and q found for the first time
        if (total == 2 && ans == null) {
            ans = node;
        }

        return total;
    }
}