package Arraysandarraylists.BinarySearch;

public class InfiniteArraySearch {
    public static void main(String[] args) {
//        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
//        int target = 10;
//        System.out.println(ans(arr,target));
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println(searchInSorted(arr,5));
    }
    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
           int nStart = end + 1;
           end = end + (end - start +1)*2;
           start = nStart;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2; // avoid overflow
            if (arr[mid] > target) {
                end = mid - 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static boolean searchInSorted(int arr[], int k) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // avoid overflow
            if (arr[mid] > k) {
                end = mid - 1;
            }
            else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
