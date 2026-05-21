package Dynammic_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreasingSubSequence {
//    static int lis(int arr[]) {
//        return LIS(0,-1,arr);
//    }
//    private static int LIS(int i, int preIdx, int[] arr) {
//        if(i==arr.length) return 0;
//        int skip = LIS(i+1,preIdx,arr);
//        if(preIdx!=-1 && arr[i]>=arr[preIdx]) return skip;
//        int pick = 1 + LIS(i+1,i,arr);
//        return Math.max(pick,skip);
//    }

//    static int lis(int arr[]) {
//        int m = arr.length;
//        int[][] dp = new int[m][m+1];
//        for(int i = 0; i <m; i++){
//            Arrays.fill(dp[i],-1);
//        }
//        return LIS(0,-1,arr,dp);
//    }
//    i : 0 -> n-1   preIdx: -1 -> n-1
//    private static int LIS(int i, int preIdx, int[] arr, int[][] dp) {
//        if(i==arr.length) return 0;
//        if(dp[i][preIdx+1]!=-1) return dp[i][preIdx];
//        int skip = LIS(i+1,preIdx,arr,dp);
//        if(preIdx!=-1 && arr[i]<=arr[preIdx]) return dp[i][preIdx] = skip;
//        int pick = 1 + LIS(i+1,i,arr,dp);
//        return dp[i][preIdx] = Math.max(pick,skip);
//    }

//  By Tabulation
//    static int lis(int arr[]) {
//        int m = arr.length;
//        int[] dp = new int[m];
//        Arrays.fill(dp,1);
//        int maxLen = 1;
//        for(int i = 1; i<m; i++){
//            int max = 0;
//            for(int j = 0; j< i; j++){
//                if(arr[j]<arr[i]){
//                    max = Math.max(dp[j],max);
//                }
//            }
//            dp[i] += max;
//            maxLen = Math.max(dp[i],maxLen);
//        }
//        return maxLen;
//    }
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int e : nums){
            if(ans.size()==0 || e>ans.get(ans.size()-1)) ans.add(e);
            else helper(e,ans);
        }
        return ans.size();
    }
    static void helper(int e, List<Integer> ans){
        int lo = 0;
        int hi = ans.size()-1;
        int lb = -1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(ans.get(mid)>=e){
                lo = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        ans.set(lb,e);
    }
}
