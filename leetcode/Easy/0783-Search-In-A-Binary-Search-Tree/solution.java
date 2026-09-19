// LeetCode Problem: Search in a Binary Search Tree
// Link: https://leetcode.com/problems/search-in-a-binary-search-tree/
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
    TreeNode ans=null;
    public TreeNode searchBST(TreeNode root, int val) {
          
          if(root==null){
            return ans;
          }
          BSTSEARCH(root,val);
    return ans;
    }
    public  void BSTSEARCH(TreeNode root,int val){

        if  (root==null) return ;

        if(val==root.val) ans=root;
            
            else if(val<root.val)
             BSTSEARCH(root.left,val);
             
             else if(val>root.val)
             BSTSEARCH(root.right,val);
    }
}