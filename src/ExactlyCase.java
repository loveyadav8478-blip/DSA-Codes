public class ExactlyCase {
    public static void main(String[] args) {
        System.out.println(slidingWindow(new int[]{1,0,1,0,1},2));
    }
    public static int slidingWindow(int[] nums, int goal){
        int n = nums.length;
        int i = 0;
        int j = 0;
        int sum = 0;
        int subarray = 0;
        while(j<n){
            sum += nums[j];
            while(sum>goal && i<n){
                sum -= nums[i];
                i++;
            }
            if(sum<=goal){
                subarray++;
            }
            j++;
        }
        return subarray;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return slidingWindow(nums,goal) - slidingWindow(nums,goal-1);
    }
    public static int slidingsWindow(int[] nums, int k){
        int n = nums.length;
        int i = 0;
        int j = 0;
        int count = 0;
        int ans = 0;
        while(j<n){
            if(nums[j]%2!=0){
                count++;
            }
            while(count>k){
                if(nums[i]%2!=0){
                    count--;
                }
                i++;
            }
            if(count<=k){
                ans += j-i+1;
            }
            j++;
        }
        return ans;
    }
}
