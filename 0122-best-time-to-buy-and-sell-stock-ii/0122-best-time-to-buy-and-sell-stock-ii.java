class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length+1][2];
        for(int i=0; i<prices.length; i++){
            for(int j=0; j<2; j++){
                dp[i][j] = -1;
            }
        }

        return getMaxProfit(prices, 0, 0, dp);
    }

    public int getMaxProfit(int[] prices, int curr, int isHolding, int[][] dp){
        if (curr == prices.length) {
            return 0;
        }

        if (dp[curr][isHolding] != -1) return dp[curr][isHolding];
        int profit1 = 0;
        int profit2 = 0;

        if(isHolding == 1){
            profit1 = prices[curr] + getMaxProfit(prices, curr+1, 0, dp);
            profit2 = 0 + getMaxProfit(prices, curr+1, 1, dp);
        }
        else{
            profit1 = -prices[curr] + getMaxProfit(prices, curr+1, 1, dp);
            profit2 = 0 + getMaxProfit(prices, curr+1, 0, dp);
        }

        dp[curr][isHolding] = Math.max(profit1, profit2);
        return dp[curr][isHolding];
    }

}