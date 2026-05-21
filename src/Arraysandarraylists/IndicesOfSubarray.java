package Arraysandarraylists;
import java.util.ArrayList;
public class IndicesOfSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        System.out.println(subarraySum(arr,12));
    }
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int start = 0, sum = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            // Shrink the window from the left as long as sum > target
            while (sum > target && start < end) {
                sum -= arr[start];
                start++;
            }
            if (sum == target) {
                // Found the subarray, return 1-based indices
                ans.add(start + 1);
                ans.add(end + 1);
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}
