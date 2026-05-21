package Dynammic_Programming;

import java.util.*;

public class LongestDivisibleSubSet {
//    public void helper(int i, int[] nums, List<Integer> ans, List<Integer> temp, int prev){
//        if(i>=nums.length){
//            if(temp.size()>ans.size()){
//                ans.clear();
//                for(int j = 0; j< temp.size(); j++){
//                    ans.add(temp.get(j));
//                }
//            }
//            return;
//        }
//        if(prev==-1 || nums[i]%prev==0){
//            temp.add(nums[i]);
//            helper(i+1,nums,ans,temp,nums[i]);
//            temp.remove(temp.size()-1);
//        }
//        helper(i+1,nums,ans,temp,prev);
//    }
//    public List<Integer> largestDivisibleSubset(int[] nums) {
//        List<Integer> ans = new ArrayList<>();
//        List<Integer> temp = new ArrayList<>();
//        Arrays.sort(nums);
//        helper(0,nums,ans,temp,-1);
//        return ans;
//    }

    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int[] prevIdx = new int[n];
        Arrays.fill(prevIdx,-1);
        int lastIdx = 0;
        int maxLen = 1;
        for(int i = 0; i< n; i++){
            int max = 0;
            int prev = -1;
            for(int j = 0; j<i; j++){
                if(nums[i]%nums[j]==0 && dp[j]>maxLen){
                    max = Math.max(max,dp[j]);
                    prev = j;
                }
            }
            dp[i] += max;
            if(dp[i]>maxLen){
                maxLen = dp[i];
                lastIdx = i;
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(lastIdx!=-1){
            ans.add(nums[lastIdx]);
            lastIdx = prevIdx[lastIdx];
        }
        return ans;
    }

//    public List<Integer> largestDivisibleSubset(int[] arr) {
//        int n = arr.length;
//        Arrays.sort(arr);
//        int[] dp = new int[n];
//        Arrays.fill(dp,1);
//        int maxLen = 1;
//        for (int i = 1; i < n; i++) {
//            int max = 0;
//            for(int j = 0; j<i; j++){
//                if(arr[i]%arr[j]==0){
//                    max = Math.max(max,dp[j]);
//                }
//            }
//            dp[i] += max;
//            maxLen = Math.max(maxLen,dp[i]);
//        }
//        int idx = 0;
//        for(int i = 0; i< n; i++){
//            if(dp[i]==maxLen){
//                idx = i;
//            }
//        }
//        List<Integer> ans = new ArrayList<>();
//        while(idx!=0){
//
//        }
//        return ans;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1, 16, 7, 8, 4};
//        int n = arr.length;
//        Arrays.sort(arr);
//        int[] dp = new int[n];
//        Arrays.fill(dp,1);
//        int maxLen = 1;
//        for (int i = 1; i < n; i++) {
//            int max = 0;
//            for(int j = 0; j<i; j++){
//                if(arr[i]%arr[j]==0){
//                    max = Math.max(max,dp[j]);
//                }
//            }
//            dp[i] += max;
//            maxLen = Math.max(maxLen,dp[i]);
//        }
//        System.out.println(maxLen);
//    }
}
