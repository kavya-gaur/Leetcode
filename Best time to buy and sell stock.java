class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        int maxprofit = 0;
        int i = 1;
        while (i < prices.length) {
            if (buy < prices[i]) {
                int profit = prices[i] - buy;
                maxprofit = Math.max(maxprofit, profit);
            } else
                buy = prices[i];
            i++;
        }

        return maxprofit;
    }
}