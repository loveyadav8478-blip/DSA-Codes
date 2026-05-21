package Dynammic_Programming;

import java.util.Arrays;

public class JumpGame {
        public boolean check(int i, int[] nums, int[] dp){
            boolean flag = false;
            int n = nums.length;
            if(i<n-1 && nums[i]==0) {
                dp[i] = 0;
                return false;
            }
            if(i>=n-1 || nums[i]>n){
                dp[i] = 1;
                return true;
            }
            if(dp[i]!=-1){
                if(dp[i]==0) return false;
                return true;
            }
            for(int j = 1; j<= nums[i]; j++){
                flag = flag || check(i+j,nums,dp);
                if(flag){
                    dp[i] = 1;
                    return true;
                }
            }
            if(flag){
                dp[i] = 1;
                return true;
            }
            else {
                dp[i] = 0;
                return false;
            }
        }
        public boolean canJump(int[] nums) {
            int[] dp = new int[nums.length];
            Arrays.fill(dp, -1);
            return check(0, nums, dp);
        }
}
