package Dynammic_Programming;

import java.util.HashMap;
import java.util.Map;

public class TargetSum {
//    public int findTargetSumWays(int[] nums, int target) {
//        return helper(0, nums, target);
//    }
//    private int helper(int i, int[] nums, int target) {
//        if(i== nums.length){
//            if(target<=0){
//                return 0;
//            }else return 1;
//        }
//        int add = helper(i+1,nums,target-nums[i]);
//        int sub = helper(i+1,nums,target+nums[i]);
//        return add+sub;
//    }

//      Memoize by Map

//    public int findTargetSumWays(int[] nums, int target) {
//        Map<String,Integer> m = new HashMap<>();
//        return helper(0,0, nums, target,m);
//    }
//    private int helper(int i, int sum, int[] nums, int target, Map<String,Integer> m) {
//        if(i== nums.length){
//            if(target==sum) return 1;
//            else return 0;
//        }
//        String key = i+"_"+sum;
//        if(!m.containsKey(key)){
//            return m.get(key);
//        }
//        int add = helper(i+1,sum+nums[i],nums,target,m);
//        int sub = helper(i+1,sum-nums[i],nums,target,m);
//        m.put(key,add+sub);
//        return add+sub;
//    }

//    Memoization by 2D matrix

    static int s;
    static int findTargetSumWays(int N, int[] nums, int target) {
        int n = nums.length;
        s = 0;
        for(int ele : nums) s += ele;
        int[][] dp = new int[n][2*s+1];
        return helper(0,0, nums, target, dp);
    }
    static int helper(int i, int sum, int[] nums, int target, int[][] dp) {
        if(i== nums.length){
            if(target==sum) return 1;
            else return 0;
        }
        if(dp[i][sum+s]!=0) return dp[i][sum+s];
        int add = helper(i+1,sum+nums[i],nums,target,dp);
        int sub = helper(i+1,sum-nums[i],nums,target,dp);
        return dp[i][sum+s] = add+sub;
    }
}
