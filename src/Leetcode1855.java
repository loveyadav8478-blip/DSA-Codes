import java.util.*;

public class Leetcode1855 {
    class Pair{
        int x;
        int y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    public int maxDistance(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j = 0;
        List<Pair> ans = new ArrayList<>();
        while(i<m && j<n){
            if(i<=j && nums1[i]<=nums2[j]){
                ans.add(new Pair(i,j));
                j++;
            } else if(nums1[i]>nums2[j]) {
                i++;
                j = i;
            } else if(j==n-1) {
                j = i;
            }
            else{
                i++;
            }
        }
        int maxD = Integer.MIN_VALUE;
        for(Pair p : ans){
            int x = p.x;
            int y = p.y;
            maxD = Math.max(maxD,j-i);
        }
        return maxD;
    }
}
