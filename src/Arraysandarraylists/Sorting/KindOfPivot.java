package Arraysandarraylists.Sorting;
import java.util.Arrays;
public class KindOfPivot {
    public static void main(String[] args) {
        int[] arr = {9,12,5,10,14,3,10};
        partition(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void partition(int[] arr){
        int l = 0;
        int h = arr.length-1;
        while (l < h){
            while (arr[l] < 0) l++;
            while (arr[h] >= 0) h--;
            if (l < h) {
                swap(arr,l,h);
            }
        }
    }
    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
