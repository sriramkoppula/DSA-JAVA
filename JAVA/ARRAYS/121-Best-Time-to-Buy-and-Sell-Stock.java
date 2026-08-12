class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];

        for (int i = 0; i < prices.length; i++) {
            int temp = prices[i] - buy;
            profit = Math.max(temp, profit);
            buy = Math.min(buy, prices[i]);
        }

        return profit;
    }
}