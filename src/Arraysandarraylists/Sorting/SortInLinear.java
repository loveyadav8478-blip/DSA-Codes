package Arraysandarraylists.Sorting;
import java.util.Arrays;
public class SortInLinear {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 7, 8, 9, 3};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortArr(int[] arr){
        int x = -1;
        int y = -1;
        int n = arr.length;
        if (n <= 1) {
            return;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i-1] > arr[i]) {
                if (x == -1) {// Looking for first conflict
                    x = i - 1;
                    y = i;
                }else{
                    y = i;
                }
            }
        }
        swap(arr,x,y);
    }
    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
