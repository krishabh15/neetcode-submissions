class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, r = 1;
        int maxProfit = 0;

        while(r < prices.length){
            if(prices[l] < prices[r]){
                int profit = prices[r] - prices[l];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                l = r;
            }

            r++;
        }

        return maxProfit;
    }
}


// public class Solution {
//     public int maxProfit(int[] prices) {
//         int maxP = 0;
//         int minBuy = prices[0];

//         for (int sell : prices) {
//             maxP = Math.max(maxP, sell - minBuy);
//             minBuy = Math.min(minBuy, sell);
//         }
//         return maxP;
//     }
// }