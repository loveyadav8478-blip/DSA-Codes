package Arraysandarraylists.Sorting;
import java.util.Arrays;
import java.sql.Array;

public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 5, 4, 1, 0, 4, 9};
        mZero(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void mZero(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] == 0 && arr[j+1] != 0){
                    swap(arr,j,j+1);
                }
            }
        }
    }
    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
