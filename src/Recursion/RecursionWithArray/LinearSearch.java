package Recursion.RecursionWithArray;
import java.util.ArrayList;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 5};
        ArrayList<Integer> ans = allArrayLists(arr,2,0);
        for (Integer i: ans) {
            System.out.println(i);
        }
    }
    static ArrayList<Integer> allArrayLists(int[] arr, int target, int i){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        //base case
        if (i >= arr.length) {
            return new ArrayList<Integer>();
        }
        //self work
        if (arr[i] == target) {
            ans.add(i);
        }
        //recursive work
        ArrayList<Integer> smallAns = allArrayLists(arr,target,i+1);
        return ans;
    }
    static void printAllIndices(int[] arr, int target, int i){
        if (i >= arr.length) return;
        if (arr[i] == target) System.out.println(i);
        printAllIndices(arr,target,i+1);
    }
    static boolean LS(int[] arr, int target, int i){
        if (i >= arr.length) return false;
        if (arr[i] == target) return true;
        return LS(arr,target,i+1);
    }
    static int LS1(int[] arr, int target, int i){
        if (i >= arr.length) return -1;
        if (arr[i] == target) return i;
        return LS1(arr,target,i+1);
    }
}
