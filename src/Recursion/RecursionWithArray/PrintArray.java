package Recursion.RecursionWithArray;
public class PrintArray {
    static void printArray(int[] arr, int index){
        if (index == arr.length) {
            return;
        }
        System.out.print(arr[index]+" ");
        printArray(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 9};
        printArray(arr,0);
    }
}
