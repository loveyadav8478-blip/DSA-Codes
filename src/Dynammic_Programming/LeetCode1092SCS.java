package Dynammic_Programming;

import java.util.Arrays;

public class LeetCode1092SCS {
    public static void main(String[] args) {
        String a = "abac";
        String b = "cab";
        System.out.println(shortestCommonSupersequence(a,b));
    }
    public static String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        String[][] dp = new String[m][n];
        for(int i = 0; i<m ;i++){
            Arrays.fill(dp[i]," ");
        }
        String lcs = Lcs(m-1,n-1,new StringBuilder(str1),new StringBuilder(str2),dp);
        StringBuilder temp = new StringBuilder(lcs);
        String ans = temp.reverse().toString();
        int i = 0;
        int j = 0;
        int k = 0;
        StringBuilder sb = new StringBuilder();
        while(i<str1.length() && j<str2.length() && k<ans.length()){
            if(str1.charAt(i)==ans.charAt(k) && str2.charAt(j)==ans.charAt(k)){
                sb.append(str1.charAt(i));
                i++;
                j++;
                k++;
            }
            else if(ans.charAt(k)!=str1.charAt(i)){
                sb.append(str1.charAt(i));
                i++;
            }
            else {
               sb.append(str2.charAt(j));
               j++;
            }
        }
        while(i<str1.length()){
            sb.append(str1.charAt(i));
            i++;
        }
        while(j<str2.length()){
            sb.append(str2.charAt(j));
            j++;
        }
        return sb.toString();
    }

    private static String Lcs(int i, int j, StringBuilder a, StringBuilder b, String[][] dp) {
        if(i<0 || j<0) return "";
        if(dp[i][j]!=" ") return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) return dp[i][j] = a.charAt(i) + Lcs(i-1,j-1,a,b,dp);
        else{
            String a1 = Lcs(i-1,j,a,b,dp);
            String a2 = Lcs(i,j-1,a,b,dp);
            return dp[i][j] = (a1.length()>a2.length()) ? a1 : a2;
        }
    }
}
