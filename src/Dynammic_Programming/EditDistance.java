package Dynammic_Programming;


import java.util.Arrays;

public class EditDistance {
//    public int minDistance(String word1, String word2) {
//        int m = word1.length(),n=word2.length();
//        return edit(m-1,n-1,new StringBuilder(word1),new StringBuilder(word2));
//    }
//
//    private int edit(int i, int j, StringBuilder a, StringBuilder b) {
//        if(i<0) return j+1;
//        if(j<0) return i+1;
//        if(a.charAt(i)==b.charAt(j)) return edit(i-1,j-1,a,b);
//        int replace = 1 + edit(i-1,j-1,a,b);
//        int remove = 1 + edit(i-1,j,a,b);
//        int insert = 1 + edit(i,j-1,a,b);
//        return Math.min(replace,Math.min(remove,insert));
//    }
    //DP

//    public int minDistance(String word1, String word2) {
//        int m = word1.length(),n=word2.length();
//        int[][] dp = new int[m+1][n+1];
//        for(int i = 0; i<m; i++){
//            Arrays.fill(dp[i],-1);
//        }
//        return edit(m-1,n-1,new StringBuilder(word1),new StringBuilder(word2),dp);
//    }
//    private int edit(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) {
//        if(i<0) return j+1;
//        if(j<0) return i+1;
//        if(dp[i][j]!=-1) return dp[i][j];
//        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = edit(i-1,j-1,a,b,dp);
//        int replace = 1 + edit(i-1,j-1,a,b,dp);
//        int remove = 1 + edit(i-1,j,a,b,dp);
//        int insert = 1 + edit(i,j-1,a,b,dp);
//        return dp[i][j] = Math.min(replace,Math.min(remove,insert));
//    }

//    Tabulation
    public int minDistance(String a, String b) {
        int m = a.length(),n=b.length();
        int[][] dp = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j< n; j++){
                int x = (i>=1 && j>=1) ? dp[i-1][j-1] : 0;
                int y = (i>=1) ? dp[i-1][j] : 0;
                int z = (j>=1) ? dp[i][j-1] : 0;
                if(a.charAt(i)==b.charAt(j)) dp[i][j] = x;
                int replace = 1 + x;
                int remove = 1 + y;
                int insert = 1 + z;
                dp[i][j] = Math.min(replace,Math.min(remove,insert));
            }
        }
        return dp[m-1][n-1];
    }
    private int edit(int i, int j, StringBuilder a, StringBuilder b, int[][] dp) {
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = edit(i-1,j-1,a,b,dp);
        int replace = 1 + edit(i-1,j-1,a,b,dp);
        int remove = 1 + edit(i-1,j,a,b,dp);
        int insert = 1 + edit(i,j-1,a,b,dp);
        return dp[i][j] = Math.min(replace,Math.min(remove,insert));
    }
}
