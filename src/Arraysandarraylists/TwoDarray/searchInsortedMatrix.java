package Arraysandarraylists.TwoDarray;

import java.util.Arrays;

public class searchInsortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(searchIntwoDArray(arr,6)));
    }
    static int[] searchIntwoDArray(int[][] arr, int target){
        int s = 0;
        int e = arr[0].length;//be cautious
        while(s <= e){
            int mid = s+(e-s)/2;
            if (arr[s][mid] == target) {
                return new int[]{s,e};
            }
            else if (arr[s][mid] < target) {
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
}
