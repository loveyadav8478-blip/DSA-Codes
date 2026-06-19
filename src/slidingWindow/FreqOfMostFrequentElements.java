package slidingWindow;
import java.util.*;
public class FreqOfMostFrequentElements {
//    Brute Force
    public int maxFrequencyB(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int st = 0;
        int end = n-1;
        while(st<end){
            int t = nums[st];
            nums[st] = nums[end];
            nums[end] = t;
            st++;
            end--;
        }
        int limit = k;
        int max = 0;
        for(int i = 0; i<n; i++){
            int count = 1;
            int target = nums[i];
            for(int j = i+1; j< n; j++){
                if(limit>0){
                    if(target-nums[j]<=k){
                        limit -= target-nums[j];
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
            max = Math.max(max,count);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,8,13};
        System.out.println(maxFrequency(nums,5));
    }
//  By Sliding Window
    public static int maxFrequency(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int tSum = 0;
        int sum = 0;
        int max = 0;
        int i = 0;
        int j = 0;
        for(j = 0; j< n; j++){
            sum += nums[j];
            while(((j-i+1)*nums[j])-sum>k){
                sum -= nums[i];
                i++;
            }
            max = Math.max(j-i+1,max);
        }
        return max;
    }
}
