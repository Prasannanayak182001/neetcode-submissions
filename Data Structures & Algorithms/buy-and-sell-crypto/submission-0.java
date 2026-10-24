class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        for(int i = 0; i< prices.length -1 ; i++){

            int profit = 0;

            for(int j = i+1; j< prices.length; j++){
                profit = prices[j] - prices[i];
                if(profit > maxProfit) maxProfit = profit;
            }

        }

        return maxProfit;
        
    }
}
