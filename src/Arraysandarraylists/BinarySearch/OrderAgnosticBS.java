package Arraysandarraylists.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {12, 45, 66, 71, 85, 94, 100, 121};
//        int[] arr = {121, 100, 52, 45, 36};
        System.out.println(orderAgnosticBS(arr, 100));
//          System.out.println(ceilingOfNumber(arr, 12));
    }

     static int orderAgnosticBS(int[] arr, int target) {
         int start = 0;
         int end = arr.length - 1;
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