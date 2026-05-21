package Dynammic_Programming;

import java.util.*;

public class RussianDoll {
//    public int maxEnvelopes(int[][] arr) {
//        Arrays.sort(arr, (a, b) -> {
//            if(a[0] == b[0]) return b[1] - a[1];
//            else return a[0] - b[0];
//        });
//        List<Integer> ans = new ArrayList<>();
//        for(int i= 0; i< arr.length; i++){
//            ans.add(arr[i][1]);
//        }
//        int n = ans.size();
//        int[] dp = new int[n];
//        int maxLen = 1;
//        Arrays.fill(dp,1);
//        for(int i = 0; i< n; i++){
//            int max = 0;
//            for(int j = 0 ;j <i; j++){
//                if(ans.get(j)<ans.get(i)){
//                    max = Math.max(max,dp[j]);
//                }
//            }
//            dp[i] += max;
//            maxLen = Math.max(maxLen,dp[i]);
//        }
//        return maxLen;
//    }

//    By Binary Search
    public int maxEnvelopes(int[][] arr) {
        Arrays.sort(arr, (a, b) -> {
            if(a[0] == b[0]) return b[1] - a[1];
            else return a[0] - b[0];
        });
        List<Integer> ans = new ArrayList<>();
        for(int[] a : arr){
            int ele = a[1];
            if(ans.size()==0 || ele>ans.get(ans.size()-1)) ans.add(ele);
            else replace(ele,ans);
        }
        return ans.size();
    }
    public void replace(int ele, List<Integer> ans){
        int lo = 0;
        int hi = ans.size()-1;
        int lb = -1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(ans.get(mid)>=ele){
                lb = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        ans.set(lb,ele);
    }



}
