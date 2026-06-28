package slidingWindow;
import java.util.*;
public class Leetcode2962 {
    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[]{1,3,2,3,3},2));
    }
    public static long countSubarraysb(int[] nums, int k) {
        int n = nums.length;
        long count = 0;
        int max = -1;
        for(int i = 0; i<n ;i++){
            max = Math.max(max,nums[i]);
        }

        for(int i = 0; i< n; i++){
            Map<Integer,Integer> m = new HashMap<>();
            for(int j = i; j< n;j++){
                if(nums[j]==max){
                    m.put(max,m.getOrDefault(max,0)+1);
                }
                if(m.containsKey(max) && m.get(max)>=k){
                    count++;
                }
            }
        }
        return count;
    }

    public static long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int count = 0;
        long ans = 0;
        int max = -1;
        for(int e : nums) max = Math.max(max,e);

        while(j<n){
            if(nums[j]==max){
                count++;
            }
            while(count>=k){
                ans += n-j;
                if(nums[i]==max){
                    count--;
                }
                i++;
            }

            j++;

        }
        return count;
    }
}
