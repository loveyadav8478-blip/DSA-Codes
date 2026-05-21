package Arraysandarraylists.Questions;
import java.util.Arrays;
public class SwapIndex {
    public static void main(String[] args) {
        int[] arr = {1,23,45,8,0};
        swap(arr,3,1);
        System.out.print(Arrays.toString(arr));
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
