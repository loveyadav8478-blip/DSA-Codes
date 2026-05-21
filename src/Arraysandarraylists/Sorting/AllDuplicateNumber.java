package Arraysandarraylists.Sorting;
import java.util.ArrayList;
import java.util.List;

public class AllDuplicateNumber {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
                if (arr[correct] != arr[i]) {
                    swap(arr, i, correct);
                }else{
                    i++;
                }
            }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                ans.add(arr[j]);
            }
        }
        return ans;
    }
    public void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
