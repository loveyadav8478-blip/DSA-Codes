package Dynammic_Programming;

import java.util.Arrays;

public class KnapSack {

    public int knapsack(int capacity, int val[], int wt[]) {
        int m = val.length+1;
        int n = capacity+1;
        int[][] dp = new int[m][n];
        for(int i = 0; i< m; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,capacity,dp,val,wt);
    }
    private int helper(int i, int capacity, int[][] dp, int[] val, int wt[]) {
        if(i== val.length){
            if(capacity>=0) return 0;
            else return Integer.MIN_VALUE;
        }
        if(dp[i][capacity]!=-1) return dp[i][capacity];
        int pick = 0;
        if(wt[i]<=capacity) {
            pick = val[i] + helper(i+1,capacity-wt[i],dp,val,wt);
        }
        int skip = helper(i+1,capacity,dp,val,wt);
        return dp[i][capacity] = Math.max(pick,skip);
    }
}
