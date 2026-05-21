package Recursion.RecursionWithArray;

public class PrintSubsetSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5};
        printSubsetSum(arr,arr.length,0,0);
    }
    static void printSubsetSum(int[] arr, int n, int i, int sum){
        if (i >= n) {
            System.out.print(sum+" ");
            return;
        }
        printSubsetSum(arr,n,i+1,sum+arr[i]);
        printSubsetSum(arr,n,i+1,sum);
    }
}
