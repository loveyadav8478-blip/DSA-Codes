package Arraysandarraylists.Sorting;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        if (arr[0] == arr[arr.length-1]||arr[0] < arr[arr.length-1]) {
            System.out.println("Array is sorted.");

        }
        else {
            for (int i = 0; i < arr.length; i++) {
                boolean flag = false;
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        flag = true;
                    }
                }
                if (!flag) {
                    return;
                }
            }
        }
    }
}