package Easy;

/**
 * Created by zhaosi on 17-6-21.
 * NO.121
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int local = 0;
        int global = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            local = Math.max(local + prices[i+1] - prices[i],0);
            global = Math.max(local, global);
        }
        return global;
    }
}
