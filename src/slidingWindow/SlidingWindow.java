package slidingWindow;

public class SlidingWindow {
    public static void main(String[] args) {
//        int[] arr = {2,1,5,1,3,2};
//        Fixed Sized Window
//        int k = 3;
//        int n = arr.length;
//        int sum = 0;
//        int max = -1;
//        int i = 0;
//        int j = 0;
//        for(j = 0; j<k ; j++){
//            sum += arr[j];
//        }
//        while(j<n){
//            sum += arr[j] - arr[i];
//            i++;
//            j++;
//            max = Math.max(max,sum);
//        }
//        System.out.println(max);




//        Brute Force
//        int[] nums = {2,3,1,2,4,3};
//        int target = 7;
//        int min = Integer.MAX_VALUE;
//        for(int i = 0; i< nums.length; i++){
//            int sum = 0;
//            for(int j = i; j< nums.length; j++){
//                sum += nums[j];
//                if(sum>=target){
//                    min = Math.min(min,j-i+1);
//                    break;
//                }
//            }
//        }
//        System.out.println(min);




//        By Sliding Window
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j< nums.length){
            sum += nums[j];
            while(sum>=target){
                min = Math.min(min,j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
        }
        System.out.println(min);

    }
}
