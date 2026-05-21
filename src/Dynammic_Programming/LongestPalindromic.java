package Dynammic_Programming;

public class LongestPalindromic {
    public static String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int maxLen = 0;
        for(int i = 0; i< n; i++){
            int row = 0;
            for(int col = i; col<n;col++,row++){
                if(row==col) dp[row][col] = 1;
                else if(s.charAt(row)==s.charAt(col)){
                    if(row == col+1) dp[row][col] = 2;
                    else if(dp[row+1][col-1] != 0) dp[row][col] = dp[row+1][col-1] + 2;
                }
                maxLen = Math.max(maxLen,dp[row][col]);
            }
        }
        String ans = "";
        for(int i = 0; i< n; i++){
            int row = 0;
            for(int col = 0; col<n;col++,row++){
                if(maxLen==dp[row][col]){
                    ans.substring(row,col+1);
                    return ans;
                }
            }
        }
        return ans;
    }
}
