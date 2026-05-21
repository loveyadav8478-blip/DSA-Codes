package Recursion.RecursionWithArray;

public class LastElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4};
        System.out.println(lastElement(arr,4,0));
    }
    static int lastElement(int[] arr, int target, int index){
        //base case
        if (index == arr.length) return -1;
        int lastElement = lastElement(arr,target,index+1);
        if (lastElement != -1) return lastElement;
        else if (arr[index] == target) return index;
        else return -1;
    }
}
