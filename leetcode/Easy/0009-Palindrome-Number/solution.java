// LeetCode Problem: Palindrome Number
// Link: https://leetcode.com/problems/palindrome-number/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isPalindrome(int x) {
        
        int num=x;
        int res=0;

        while(num>0){

            int rem=num%10;
             res=res*10+rem;
             num=num/10;

        }

        return res==x;
    }
}