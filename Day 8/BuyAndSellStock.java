//Link:-https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i =1 ; i<prices.length ; i++){
            if(buy< prices[i]){
                profit = Math.max(prices[i] - buy , profit);
            }else{
                buy = prices[i];
            }
        }
        return profit;
    }
}
