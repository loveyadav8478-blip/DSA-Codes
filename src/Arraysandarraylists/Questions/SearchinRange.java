package Arraysandarraylists.Questions;

public class SearchinRange {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5, 8, 96},
                {5, 0, 6},
                {2, 8, 4, 46, 2},
                {2, 87, 4, 67, 100}
        };
        System.out.println("Maximum Value is : "+max(arr));
        System.out.println("Minimum Value is : "+min(arr));
//        int[] ans = searchRange(arr, 6);
//        System.out.println(Arrays.toString(ans));
    }
    static int max(int[][] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (maxVal < arr[row][col]) {
                    maxVal = arr[row][col];
                }
            }
        }
        return maxVal;
    }
    static int min(int[][] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (minVal > arr[row][col]) {
                    minVal = arr[row][col];
                }
            }
        }
        return minVal;
    }

    static int[] searchRange(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}