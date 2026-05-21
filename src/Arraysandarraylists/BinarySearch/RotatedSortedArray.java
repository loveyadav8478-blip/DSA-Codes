package Arraysandarraylists.BinarySearch;

public class RotatedSortedArray {
    public static void main(String[] args) {
//        int[] arr = {3, 4, 5, 1, 2};
        int[] arr = {0, 0, 0, 1, 1, 1, 2, 0, 0, 0};
        System.out.println(BSinRotatedSortedArray_(arr,2));
    }
    static int BSinRotatedSortedArray_(int[] arr, int target){
        int st = 0;
        int end = arr.length-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[st] == arr[mid] && arr[end] == mid) {
                st++;
                end--;
            } else if (arr[mid] <= arr[end]) {
                if (target > arr[mid] && target <= arr[end]) st = mid + 1;
                else end = mid - 1;
            }else{
                if (target >= arr[st] && target < arr[mid]) end = mid - 1;
                else st = mid + 1;
            }
        }
        return -1;
    }
    static int BSinRotatedSortedArray(int[] arr, int target){
        int st = 0;
        int end = arr.length-1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < arr[end]) {
                if (target > arr[mid] && target <= arr[end]) st = mid + 1;
                else end = mid - 1;
            }else{
                if (target >= arr[st] && target < arr[mid]) end = mid - 1;
                else st = mid + 1;
            }
        }
        return -1;
    }
}
