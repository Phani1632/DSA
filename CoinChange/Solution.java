package CoinChange;

import java.util.Arrays;

public class Solution {
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int coin: coins){
                if(coin<=i && dp[i-coin]!=Integer.MAX_VALUE){
                    dp[i]=Math.min(dp[i], dp[i-coin]+1);
                    // System.out.println(dp[i]);
                }
            }
        }

        return dp[dp.length-1]==Integer.MAX_VALUE?-1:dp[dp.length-1];
    }
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        System.out.println(coinChange(coins, 11));
    }
}
