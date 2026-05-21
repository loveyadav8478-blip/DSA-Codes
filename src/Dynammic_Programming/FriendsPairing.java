package Dynammic_Programming;

import java.util.Arrays;

public class FriendsPairing {
    public long friendsPair(int n, int[] dp){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = (int)(friendsPair(n-1,dp)+(n-1)*friendsPair(n-2,dp));
    }
    public long countFriendsPairings(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return friendsPair(n,dp);
    }

//    Iterative Dynammic programming
    public long countFriendsPairings2(int n) {
        long[] dp = new long[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i<=n; i++){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        return dp[n-1];
    }
}
