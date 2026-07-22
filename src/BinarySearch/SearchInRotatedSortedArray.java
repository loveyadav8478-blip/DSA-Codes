package BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2},0));
    }
    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[i]<=nums[mid]){//when i go to the left when the given array is sorted so we
                //check this first
                if(target<=nums[mid] && target>=nums[i])//check the left part
                    j = mid-1;
                else i = mid+1;
            }
            else{
                if(target>=nums[mid] && target<=nums[j])
                    i = mid+1;
                else j = mid-1;
            }
        }
        return -1;
    }
}
