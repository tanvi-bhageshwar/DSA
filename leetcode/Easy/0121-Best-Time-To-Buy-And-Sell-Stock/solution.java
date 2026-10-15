// LeetCode Problem: Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Difficulty: Easy
// Language: java

class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

       for(int i=0;i<prices.length;i++){
        
        if(prices[i]<buyPrice){
            buyPrice=prices[i];
           
        }
        if(prices[i]!=buyPrice){
      int profit=prices[i]-buyPrice;
            maxProfit=Math.max(profit,maxProfit);
        }

       }
        return maxProfit;
    }
}
