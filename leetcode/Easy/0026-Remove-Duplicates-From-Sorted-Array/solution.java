// LeetCode Problem: Remove Duplicates from Sorted Array
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Difficulty: Easy
// Language: java

class Solution {
    public int removeDuplicates(int[] nums) {
         int n=nums.length;
          
         int i=0;
         int j=1;

         while(j<n){

           if (nums[j]==nums[i]){
             
             j++;
            }
            else {
             i++;
             nums[i]=nums[j];

            }
         }
         return i+1;
    }
}