package slidingWindow;

public class SubArrayPdtLessThenK {
    public static void main(String[] args) {
//        System.out.println(numSubarrayProductLessThanK(new int[]{10,9,10,4,3,8,3,3,6,2,10,10,9,3},19));
        System.out.println(numSubarrayProductLessThanK(new int[]{1,2,3,4,5},1));
    }

//    SLIDING WINDOW
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int i = 0;
        int j = 0;
        int pdt = 1;
        while(j<n){
            pdt *= nums[j];
            while(pdt>=k && i<n){
                pdt /= nums[i];
                i++;
            }
            if(pdt<k){
                count += j-i+1;
            }
            j++;
        }
        return count;
    }
}
