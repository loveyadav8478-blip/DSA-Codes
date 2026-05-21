package Dynammic_Programming;

import java.util.Arrays;

public class HouseRobber2 {
    public int rob1(int i, int[] nums, int[] dp1){
        int n = nums.length;
        if(i==n-2) return dp1[i] = nums[i];
        if(i==n-3) return dp1[i] = Math.max(nums[i],nums[i+1]);
        if(dp1[i]!=-1) return dp1[i];
        int skip = rob1(i+1,nums,dp1);
        int pick = nums[i] + rob1(i+2,nums,dp1);
        return dp1[i] = Math.max(pick,skip);
    }
    public int rob2(int i, int[] nums, int[] dp2){
        int n = nums.length;
        if(i==n-1) return dp2[i] = nums[i];
        if(i==n-2) return dp2[i] = Math.max(nums[i],nums[i+1]);
        if(dp2[i]!=-1) return dp2[i];
        int skip = rob2(i+1,nums,dp2);
        int pick = nums[i] + rob2(i+2,nums,dp2);
        return dp2[i] = Math.max(pick,skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp1 = new int[n];
        int[] dp2 = new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(rob1(0,nums,dp1),rob2(1,nums,dp2));
    }
}
