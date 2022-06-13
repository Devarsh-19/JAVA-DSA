package basic;

public class Stocks {
    public static int maxProfit(int[] prices) {
        int maxProfit1 = 0, maxProfit2 = 0;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            min1 = Math.min(min1, prices[i]);
            maxProfit1 = Math.max(maxProfit1, prices[i] - min1);

            min2 = Math.min(min2, prices[i] - maxProfit1);
            maxProfit2 = Math.max(maxProfit2, prices[i] - min2);
        }
        return maxProfit2;

    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(maxProfit(arr));
    }
}
