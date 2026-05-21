package Dynammic_Programming;

import java.util.Arrays;

public class LongestBitonicString {
    public static int longestBitonicSequence(int n, int[] nums) {
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1,1);
        Arrays.fill(dp2,1);
        for(int i = 1; i < n ;i++){
            int max = 0;
            for(int j = 0; j<i; j++){
                if(nums[j]<nums[i]){
                    max = Math.max(max,dp1[j]);
                }
            }
            dp1[i] += max;
        }
        for(int i = n-1; i >= 0 ;i--){
            int max = 0;
            for(int j = i+1; j<n; j++){
                if(nums[j]<nums[i]){
                    max = Math.max(max,dp2[j]);
                }
            }
            dp2[i] += max;
        }
        int ans = 0;
        for(int i = 0; i<n ; i++){
            if(dp1[i]!=1 && dp2[i]!=1)
                ans = Math.max(dp1[i]+dp2[i]-1,ans);
        }
        return ans;
    }
}
