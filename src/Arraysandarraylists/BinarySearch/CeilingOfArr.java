package Arraysandarraylists.BinarySearch;

public class CeilingOfArr {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
//        int[] arr = {121, 100, 52, 45, 36};

          System.out.println(smallestletter(arr,'c'));
    }
    public static int ceilingOfNumber(int[] arr, int target) {
        if (target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
             // avoid overflow
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
    public static char smallestletter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // avoid overflow
            if (arr[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
    public static int floorOfNumber(int[] arr, int target) {
        if (target < arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            mid = start + (end - start) / 2; // avoid overflow

            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
}
