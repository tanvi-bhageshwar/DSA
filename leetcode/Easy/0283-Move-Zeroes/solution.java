// LeetCode Problem: Move Zeroes
// Link: https://leetcode.com/problems/move-zeroes/
// Difficulty: Easy
// Language: java

class Solution {
    public void moveZeroes(int[] arr) {
        
      
      int n=arr.length;
      
       int j=0;
       for(int i=0;i<n;i++){
         
         if(arr[i]!=0){
             
             arr[j]=arr[i];
             j++;
         }

       }
       for(int i=j;j<n;j++){
        arr[j]=0;
       }



    }
    
}

// 1 0i 0j  3  12 