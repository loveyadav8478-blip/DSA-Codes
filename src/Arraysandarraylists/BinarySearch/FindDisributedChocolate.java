package Arraysandarraylists.BinarySearch;

import java.util.ArrayList;

public class FindDisributedChocolate {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 2};
        int m = 3;
        System.out.println(findDisributedChocolate(arr,m));

    }
    static boolean isDistributPosible(int[] arr, int m, int maxAllowed){
        int nos = 1;
        int choc = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxAllowed) return false;
            if (choc+arr[i] <= maxAllowed) {
                choc += arr[i];
            }else{
                nos++;
                choc = arr[i];
            }
        }
        return nos <= m;
//        if (nos > m) return false;
//        return true;
    }
    static int findDisributedChocolate(int[] arr, int m){
        int st = 1;
        int end = (int)1e9;
        int ans = 0;
        while(st <= end){
            int mid = st +(end - st)/2;
            if(isDistributPosible(arr,m,mid)){
                ans = mid;
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return ans;
    }
}
