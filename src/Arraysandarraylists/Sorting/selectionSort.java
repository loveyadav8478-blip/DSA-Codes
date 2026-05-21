package Arraysandarraylists.Sorting;
import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
//        selectionSort(arr);
        selectionSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,last,maxIndex);
        }
    }
    static void selectionSort1(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minindex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }
            swap(arr,i,minindex);
//            int temp = arr[i];
//            arr[i] = arr[minindex];
//            arr[minindex] = temp;
        }
    }
    static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
     static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
