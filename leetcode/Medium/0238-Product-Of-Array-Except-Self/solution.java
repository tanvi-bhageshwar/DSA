// LeetCode Problem: Product of Array Except Self
// Link: https://leetcode.com/problems/product-of-array-except-self/
// Difficulty: Medium
// Language: java

class Solution {
    public int[] productExceptSelf(int[] nums) {
        

        int n=nums.length;
         int [] ans=new int[n];
        if(n==0) return ans;
        int []prefix=new int[n];
        int []suffix=new int[n];
       
        prefix[0]=1;
        suffix[n-1]=1;
        for(int i=1;i<n;i++){
            
            prefix[i]=prefix[i-1]*nums[i-1];

        }
        for(int i=n-2;i>=0;i--){

            suffix[i]=suffix[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++){

            int prod=prefix[i]*suffix[i];
            ans[i]=prod;


        }

           return ans;
    }
}