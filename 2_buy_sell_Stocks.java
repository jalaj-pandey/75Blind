class Solution {
    public int maxProfit(int[] prices) {
     int n = prices.length;
     int buyPrice = Integer.MAX_VALUE;
     int maxProfit = 0;
     
     for(int i = 0; i < n; i++){
        if(buyPrice < prices[i]){
            int profit = prices[i] - buyPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        else{
            buyPrice = prices[i];
        }
     }
     return maxProfit;
     
    }
}


class Solution2 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int min = prices[0];
        
        for(int i=0; i<n; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }
}