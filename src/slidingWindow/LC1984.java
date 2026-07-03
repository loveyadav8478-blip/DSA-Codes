package slidingWindow;
import java.util.*;
public class LC1984 {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        int  i = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(i = 0; i< n; i++){
            for(j = i; j< n; j++){
                if(j==i+k-1){
                    min = Math.min(min,nums[j]-nums[i]);
                }
                else{
                    if(j!=i){
                        min = Math.min(min,nums[j]-nums[i]);
                    }
                }
            }
        }
        return min;
    }
}
