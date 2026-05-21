package Arraysandarraylists.Sorting;
import java.util.Arrays;
public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if (arr[correct] != arr[i]) {
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
