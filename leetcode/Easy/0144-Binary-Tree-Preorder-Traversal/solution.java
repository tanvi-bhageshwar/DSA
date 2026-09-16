// LeetCode Problem: Binary Tree Preorder Traversal
// Link: https://leetcode.com/problems/binary-tree-preorder-traversal/
// Difficulty: Easy
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
    List<Integer> ans=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        
        Preorder(root);
        return ans;
    }


    public void Preorder(TreeNode root){

        if(root==null){
            return;
        }

        ans.add(root.val);

        Preorder(root.left);
        Preorder(root.right);
    }
}