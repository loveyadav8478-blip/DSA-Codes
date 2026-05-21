package Arraysandarraylists.BinarySearch;

public class SearchInTwoDArray {
    public static void main(String[] args) {
        int[][] arr = { {1, 3, 5, 7},
                        {10, 11, 16, 20},
                        {23, 30, 34, 60}};
        System.out.println(searchMatrix(arr,3));
    }
    static boolean searchMatrix(int[][] arr, int target){
        int n = arr.length,m = arr[0].length;
        int st = 0;
        int end = n * m - 1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            int midEle = arr[mid/m][mid%m];
            if (midEle == target) return true;
            else if (target < midEle) end = mid - 1;
            else st = mid + 1;
        }
        return false;
    }
}
