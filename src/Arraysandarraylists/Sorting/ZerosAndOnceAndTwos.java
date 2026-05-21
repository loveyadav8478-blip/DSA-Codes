package Arraysandarraylists.Sorting;
import java.util.Arrays;
public class ZerosAndOnceAndTwos {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0, 0};
        sort012_2(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort012_1(int[] arr){
        int count_0 = 0,count_1 = 0,count_2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count_0++;
            }
            else if(arr[i] == 1) {
                count_1++;
            }else{
                count_2++;
            }
        }
        int k = 0;
        while(count_0 > 0){
            arr[k++] = 0;
            count_0--;
        }
        while(count_1 > 0){
            arr[k++] = 1;
            count_1--;
        }
        while(count_2 > 0){
            arr[k++] = 2;
            count_2--;
        }
    }
    static void sort012_2(int[] arr){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while(mid <= high){
            if (arr[mid] == 0) {
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
