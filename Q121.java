// logic is that we have to  find the min_price...if min_price is less than the current value of i then we will replace the current the value with min price and with every iteration we will compare max profit

class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min_price = Integer.MAX_VALUE;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - min_price;

            if (profit > max) {
                max = profit;
            }
            if (prices[i] < min_price) {
                min_price = prices[i];
            }
        }
        return max;
    }
}