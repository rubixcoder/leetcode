class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int totalProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            int profit = prices[i] - minPrice;

            if (profit > 0) {
                totalProfit += profit;
                minPrice = prices[i];
            }
        }

        return totalProfit;
    }
}
