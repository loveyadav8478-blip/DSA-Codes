package BinarySearch;

public class BinarySearchOnAnswer {
    public int shipWithinDays(int[] nums, int d) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int e : nums){
            sum += e;
            if(e > max) max = e;
        }
        int lo = max;
        int hi = sum;
        int ans = sum;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int count = 1;
            int temp = 0;
            for(int e : nums){
                if(temp+e <= mid){
                    temp += e;
                }
                else{
                    count++;
                    temp = e;
                }
            }
            if(count <= d){
                ans = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return ans;
    }
}
