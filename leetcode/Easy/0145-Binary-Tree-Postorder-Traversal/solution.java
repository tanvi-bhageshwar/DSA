// LeetCode Problem: Binary Tree Postorder Traversal
// Link: https://leetcode.com/problems/binary-tree-postorder-traversal/
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
    List<Integer>ans =new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
          
         Postorder(root);
        return ans;

     
}

 public void Postorder(TreeNode root){
      
      if(root==null) return;
           
           Postorder(root.left);
           Postorder(root.right);
            ans.add(root.val);
 }
}