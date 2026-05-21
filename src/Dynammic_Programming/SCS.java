package Dynammic_Programming;

import java.util.Arrays;

public class SCS {
    public static int minSuperSeq(String s1, String s2) {
        int m =s1.length();
        int n=s2.length();
        int[][] dp = new int[m][n];
        for(int i = 0; i<m; i++){
            Arrays.fill(dp[i],-1);
        }
        return m+n-LCS(m-1,n-1,new StringBuilder(s1),new StringBuilder(s2),dp);
    }
    static int LCS(int i, int j, StringBuilder s1, StringBuilder s2, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] = 1 + LCS(i-1,j-1,s1,s2,dp);
        }
        else{
            return dp[i][j] = Math.max(LCS(i-1,j,s1,s2,dp),LCS(i,j-1,s1,s2,dp));
        }
    }
}
