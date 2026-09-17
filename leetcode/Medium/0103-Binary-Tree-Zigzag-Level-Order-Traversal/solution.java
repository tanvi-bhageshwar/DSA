// LeetCode Problem: Binary Tree Zigzag Level Order Traversal
// Link: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();

        if(root==null) return ans;
        Queue<TreeNode> q= new LinkedList<>();
         Boolean LtoR=true;
        q.add(root);

        while(!q.isEmpty()){

            int n=q.size();
            List<Integer>res=new ArrayList<>();

            for(int i=0;i<n;i++){
               
               TreeNode curr=q.poll();
               if(LtoR){
                      res.add(curr.val);
               }
               else{
                res.add(0,curr.val);
               }

               if(curr.left!=null){
                q.add(curr.left);
               }
               if(curr.right!=null){
                q.add(curr.right);
               }


            }
            LtoR=!(LtoR);
            ans.add(res);
        }
return             ans;
    }
}