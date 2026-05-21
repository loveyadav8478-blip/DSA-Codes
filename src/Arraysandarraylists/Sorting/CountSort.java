package Arraysandarraylists.Sorting;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 3, 1, 3, 5};
//        basicCount(arr);
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }
    static void countSort(int[] arr){
        int n = arr.length;
        int max = findMax(arr);
        int[] count = new int[max+1];
        for (int i : arr) { // TC ==> n
            count[i]++;
        }
        /* or */
//        for (int i = 0; i < arr.length; i++) {
//            count[arr[i]]++;
//        }
        // Make a prefix sum array of the count array
        for (int i = 1; i < count.length; i++) {// TC ==>> max
            count[i] += count[i-1];
        }
        // Find the index of the index of each element in the original array and put it into the output array
        int[] output = new int[n];
        for (int i = n-1; i >= 0; i--) {// TC ==>> n
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        // Copy all the elements from the prefix array to the output array
        System.arraycopy(output, 0, arr, 0, n);
        /* OR */
//        for (int i = 0; i < n; i++) {// TC ==>> n
//            arr[i] = output[i];
//        }
    }
    static void basicCount(int[] arr){
        int max = findMax(arr);
        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
                System.out.print(count[i]);
            }
        }
    }
}
