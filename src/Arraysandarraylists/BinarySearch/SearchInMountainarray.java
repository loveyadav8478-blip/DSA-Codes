package Arraysandarraylists.BinarySearch;

public class SearchInMountainarray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        System.out.println(search(arr,3));
    }

    static int search(int[] arr, int target){
    int peak = peakIndexInMountainArray(arr);
    int firstTry = orderAgnosticBS(arr,3,0,peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(arr,3,peak+1,arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
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
//1,2,3,4,5
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        boolean isABS = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2; // avoid overflow
            if (arr[mid] == target) {
                return mid;
            }
            if (isABS) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
