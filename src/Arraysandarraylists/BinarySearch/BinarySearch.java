package Arraysandarraylists.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {12, 45, 66, 71, 85, 94, 100, 121};
        int[] arr = {121, 100, 52, 45, 36};
            System.out.println(binarySearch2(arr, 12));
//          System.out.println(ceilingOfNumber(arr, 12));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // avoid overflow

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1; // not found
    }
    public static int binarySearch2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // avoid overflow

            if (arr[mid] == target) {
                return mid;
            }
            if (target > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1; // not found
    }
}
