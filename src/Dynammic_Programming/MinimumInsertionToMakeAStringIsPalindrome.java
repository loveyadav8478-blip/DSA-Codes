package Dynammic_Programming;

import java.util.Arrays;

public class MinimumInsertionToMakeAStringIsPalindrome {
    public int minInsertions(String s) {
        return s.length()-LPS(s);
    }
    public int LPS(String s) {
        StringBuilder sb = new StringBuilder(s);
        return lcs(s,sb.reverse().toString());
    }
    public int lcs(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i],-1);
        }
        return LCS(m-1,n-1,a,b,dp);
    }
    public int LCS(int i, int j, String a, String b, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = 1 + LCS(i-1,j-1,a,b,dp);
        else return dp[i][j] = Math.max(LCS(i-1,j,a,b,dp),LCS(i,j-1,a,b,dp));
    }
}
