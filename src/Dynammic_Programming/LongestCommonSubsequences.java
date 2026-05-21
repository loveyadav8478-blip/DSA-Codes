package Dynammic_Programming;

import java.util.Arrays;
import java.util.concurrent.Callable;

public class LongestCommonSubsequences {
//    public int longestCommonSubsequence(String a, String b) {
//        int m = a.length(), n = b.length();
//        int[][] dp = new int[m+1][n+1];
//        for (int i = 0; i < m; i++) {
//            Arrays.fill(dp[i],-1);
//        }
//        return LCS(m-1,n-1,new StringBuilder(a),new StringBuilder(b),dp);
//    }
//    public int LCS(int i, int j, StringBuilder a, StringBuilder b, int[][] dp){
//        if(i<0 || j<0) return 0;
//        if(dp[i][j]!=-1) return dp[i][j];
//        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = 1 + LCS(i-1,j-1,a,b,dp);
//        else return dp[i][j] = Math.max(LCS(i-1,j,a,b,dp),LCS(i,j-1,a,b,dp));
//    }

//    Tabulation :)
    public int longestCommonSubsequence(String a, String b) {
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i<= m; i++){
            for(int j = 1; j<=n; j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String a = "anjum", b = "anuj";
        int m = a.length(), n = b.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i<= m; i++){
            for(int j = 1; j<=n; j++){
                if(a.charAt(i-1)==b.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        int i = m;
        int j = n;
        StringBuilder sb = new StringBuilder("");
        while(i>0 && j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                sb.append(a.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i][j-1]>=dp[i-1][j]) j--;
                else i--;
            }
        }
        System.out.println(sb.reverse().toString());
    }

    //Tabulation :(
//    public int longestCommonSubsequence(String a, String b) {
//        int m = a.length(), n = b.length();
//        int[][] dp = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            for(int j = 0; j< n; j++){
//                int x = (i-1>=0 && j-1>=0) ? dp[i-1][j-1] :0;
//                int y = (i-1>=0) ? dp[i-1][j] : 0;
//                int z = (j-1>=0) ? dp[i][j-1] :0;
//                if(a.charAt(i)==b.charAt(j)) dp[i][j] = 1 + x;
//                else dp[i][j] = Math.max(y,z);
//            }
//        }
//        return dp[m-1][n-1];
//    }
}
