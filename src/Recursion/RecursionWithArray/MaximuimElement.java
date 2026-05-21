package Recursion.RecursionWithArray;

public class MaximuimElement {
    static int max(int[] arr, int index){
        if (index == arr.length-1) return arr[index];
        int ansLeft = arr[index];
        int ansRight = max(arr,index+1);
        return Math.max(ansLeft,ansRight);
    }
    public static void main(String[] args) {
        int[] arr = {7, 6, 0, -33, 7};
        System.out.println(max(arr,0));
    }
}
