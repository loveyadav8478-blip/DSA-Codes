package Arraysandarraylists.BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
            int[] nums ={4,5,6,7,0,1,2};
        System.out.println(searchinRotated1(nums,3));
    }
    public static int searchinRotated1(int[] nums, int target){
        int st = 0;
        int end = nums.length-1;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if (nums[mid] > nums[end]) {
                st = mid + 1;
            }else{
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    public static int searchinRotated(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start +(end-start)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && nums[mid] >= target) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
