package Dynammic_Programming;

import java.util.Arrays;

public class Printing_SCS {
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
        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j] = 1 + LCS(i-1,j-1,s1,s2,dp);
        else return dp[i][j] = Math.max(LCS(i-1,j,s1,s2,dp),LCS(i,j-1,s1,s2,dp));
    }
    static String LCS1(int i, int j, StringBuilder s1, StringBuilder s2){
        if(i<0 || j<0) return "";
        if(s1.charAt(i)==s2.charAt(j)) return s1.charAt(i) + LCS1(i-1,j-1,s1,s2);
        else{
            String a = LCS1(i-1,j,s1,s2);
            String b = LCS1(i,j-1,s1,s2);
            return (a.length() > b.length()) ? a : b;
        }
    }
    public static void main(String[] args){
        String s1 = "Kitten";
        String s2 = "Sitting";
        int m = s1.length(), n= s2.length();
        String lcs = LCS1(m-1,n-1,new StringBuilder(s1),new StringBuilder(s2));
        StringBuilder Lcs = new StringBuilder(lcs);
        String LCS = Lcs.reverse().toString();
        int i = 0, j = 0, k = 0;
        StringBuilder ans = new StringBuilder();
        while(i<s1.length() && j<s2.length() && k<LCS.length()){
            if(LCS.charAt(k)==s1.charAt(i) && LCS.charAt(k)==s2.charAt(j)){
                ans.append(s1.charAt(i));
                i++;j++;k++;
            }
            else if(LCS.charAt(k)!=s1.charAt(i)) {
                ans.append(s1.charAt(i));
                i++;
            }
            else{
                ans.append(s2.charAt(j));
                j++;
            }
        }
        while(i<s1.length()){
            ans.append(s1.charAt(i));
            i++;
        }
        while(j<s2.length()){
            ans.append(s2.charAt(j));
            j++;
        }

        System.out.println(ans);
    }
}
