package Recursion.RecursionWithArray;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr,0));
    }
    static boolean isSorted(int[] arr, int index){
        //base case
        if (index >= arr.length-1) return true;
        //self work
        if (arr[index] < arr[index+1]) return false;
        //recursive work
        return isSorted(arr,index+1);
    }
}
