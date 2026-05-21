package Arraysandarraylists.Sorting;
import java.util.Arrays;
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {293,31,734,9023,923,949};
        radixSort(arr);
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
    static void countSort(int[] arr, int place){
        int n = arr.length;
        int[] count = new int[10];
//        for (int i : arr) { // TC ==> n
//            count[i]++;
//        }
        /* or */
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i]/place)%10]++;
        }
        // Make a prefix sum array of the count array
        for (int i = 1; i < count.length; i++) {// TC ==>> max
            count[i] += count[i-1];
        }
        // Find the index of the index of each element in the original array and put it into the output array
        int[] output = new int[n];
        for (int i = n-1; i >= 0; i--) {// TC ==>> n
            int idx = count[(arr[i]/place)%10]-1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        // Copy all the elements from the prefix array to the output array
        System.arraycopy(output, 0, arr, 0, n);
        /* OR */
//        for (int i = 0; i < n; i++) {// TC ==>> n
//            arr[i] = output[i];
//        }
    }
    static void radixSort(int[] arr){
        int max = findMax(arr);
        for (int place = 1; max/place > 0; place*=10) {
            countSort(arr,place);
        }
    }
}
