package Arraysandarraylists.Sorting;

import java.util.Arrays;

public class Setmismatch {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if (arr[correct] != arr[i]) {
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                return new int[]{arr[j], j+1};
            }
        }
        return new int[]{-1, -1};
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }




}
