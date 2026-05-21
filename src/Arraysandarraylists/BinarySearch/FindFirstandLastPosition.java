package Arraysandarraylists.BinarySearch;

import java.util.ArrayList;

public class FindFirstandLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(searchRange(nums,7));
    }
    public static int[] searchRange(int[] nums, int target) {
        int Index1 = findLeft(nums,target);
        int Index2 = findRight(nums,target);
        return new int[] {Index1,Index2};
    }
    static int findLeft(int[] nums, int target){
        int result = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                result = mid;
                end = mid -1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid + 1;
            }
        }
        return result;
    }
    static int findRight(int[] nums, int target){

        int result = -1;
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == nums[mid]){
                result = mid;
                start = mid + 1;
            }else if(target >= nums[mid]){
                start = mid + 1;
            }else{
                end = mid + 1;
            }
        }
        return result;
    }
}
