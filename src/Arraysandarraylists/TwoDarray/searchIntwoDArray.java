package Arraysandarraylists.TwoDarray;

import java.util.Arrays;

public class searchIntwoDArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(Arrays.toString(searchIntwoDArray(arr,12)));
    }
    static int[] searchIntwoDArray(int[][] arr, int target){
        int rows = 0;
        int cols = arr.length-1;
        while(rows < arr.length && cols >= 0){
            if (target == arr[rows][cols]) {
                return new int[] {rows,cols};
            }else if (target < arr[rows][cols]) {
                cols--;
            }else{
                rows++;
            }
        }
        return new int[] {-1,-1};
    }
}
