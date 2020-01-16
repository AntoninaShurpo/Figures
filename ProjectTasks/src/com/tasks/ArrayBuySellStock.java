package com.tasks;

public class ArrayBuySellStock {
    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(nums);
        System.out.println("MaxProfit is: " + result);
    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        }
        return maxProfit;
    }
}
