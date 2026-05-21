package Arraysandarraylists.BinarySearch;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {0,1,11,2};
        System.out.println(peakIndexInMountainArray1(arr));
    }
    static int peakIndexInMountainArray1(int[] arr){
        int st = 0;
        int end = arr.length-1;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if (arr[mid] < arr[mid+1]) {
                ans = mid + 1;
                st = mid + 1;
            }else end = mid - 1;
        }
        return ans;
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) /2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
