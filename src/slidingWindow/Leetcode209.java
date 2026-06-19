package slidingWindow;

public class Leetcode209 {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(i = 0; i< n; i++){
            int sum = 0;
            for(j = i; j< n; j++){
                sum += nums[j];
                if(sum>=target){
                    min = Math.min(min,j-i+1);
                }
            }
        }
        return (min==Integer.MAX_VALUE) ? 0 : min;
    }
}
