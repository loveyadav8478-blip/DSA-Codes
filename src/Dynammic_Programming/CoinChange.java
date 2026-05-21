package Dynammic_Programming;

public class CoinChange {
//    public int coinChange(int[] coins, int amount) {
//        int ans = helper(0,coins,amount);
//        return (ans==Integer.MAX_VALUE) ? -1 : ans;
//    }
//    private int helper(int i, int[] coins, int amount) {
//        if(i==coins.length){
//            if(amount == 0) return 0;
//            else return Integer.MAX_VALUE;
//        }
//        int skip = helper(i+1,coins,amount);
//        if(coins[i]>amount) return skip;
//        int take = helper(i,coins,amount-coins[i]);
//        int pick = (take==Integer.MAX_VALUE) ? take : 1+take;
//        return Math.min(pick,skip);
//    }


    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        int ans = helper(0,coins,amount,dp);
        return (ans==Integer.MAX_VALUE) ? -1 : ans;
    }
    private int helper(int i, int[] coins, int amount, int[][] dp) {
        if(i==coins.length){
            if(amount == 0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][amount]!=0) return dp[i][amount];
        int skip = helper(i+1,coins,amount,dp);
        if(coins[i]>amount) return skip;
        int take = helper(i,coins,amount-coins[i],dp);
        int pick = (take==Integer.MAX_VALUE) ? take : 1+take;
        return dp[i][amount] = Math.min(pick,skip);
    }
}
