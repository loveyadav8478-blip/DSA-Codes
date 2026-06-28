package slidingWindow;

public class Leetcode2302 {
    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[]{9,5,3,8,4,7,2,7,4,5,4,9,1,4,8,10,8,10,4,7},4));
    }
    public static long countSubarrays(int[] nums, long k) {
        int score = 0;
        int n = nums.length;
        int i = 0;
        int j = 0;
        long ans = 0;
        while(j<n){
            score += nums[j];
            score *= j-i+1;
            while(score>=k){
                score /= j-i+1;
                score -= nums[i];
                i++;
                score *= j-i+1;
            }
            if(score<k){
                ans += j-i+1;
            }
            if(score!=0){
                score /= j-i+1;
            }
            j++;
        }
        return ans;
    }
}
