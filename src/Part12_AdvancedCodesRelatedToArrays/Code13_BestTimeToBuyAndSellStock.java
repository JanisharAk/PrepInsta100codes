package Part12_AdvancedCodesRelatedToArrays;

public class Code13_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        // Edge case: If there are no prices or only one day, no profit can be made
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];  // Store the minimum price seen so far
        int maxProfit = 0;         // Store the maximum profit

        // Traverse the array
        for (int i = 1; i < prices.length; i++) {
            // Calculate the current profit if selling at day i
            int profit = prices[i] - minPrice;
            // Update maxProfit if the current profit is greater
            maxProfit = Math.max(maxProfit, profit);
            // Update minPrice to the lowest price seen so far
            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;  // Return the maximum profit found
    }

    public static void main(String[] args) {
        Code13_BestTimeToBuyAndSellStock sol = new Code13_BestTimeToBuyAndSellStock();
        int[] prices = {7, 1, 5, 3, 6, 4};  // Example input
        System.out.println("Max Profit: " + sol.maxProfit(prices));  // Expected Output: 5
    }
}
