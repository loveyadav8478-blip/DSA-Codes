package Arraysandarraylists.Sorting;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low, int high){
        if(low >= high) return;
        int pi = partition2(arr, low, high);
        quickSort(arr, low,pi-1);
        quickSort(arr,pi+1, high);
    }
    static int partition1(int[] arr, int low, int high){
        int pivot = arr[low];
        int count = 0;
        for (int i = low+1; i <= high; i++) {
            if (arr[i] <= pivot) count++;
        }
        int pindex = low + count;
        swap(arr,low,pindex);
        int i = low, j = high;
        while(i < pindex && j > pindex){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if (i < pindex && j > pindex) {
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pindex;
    }
    static int partition2(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= pivot && i <= high-1){
                i++;
            }
            while(arr[j] > pivot && j >= low + 1){
                j--;
            }
            if(i < j) swap(arr,i,j);

        }
        swap(arr,low,j);
        return j;
    }
    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

}
