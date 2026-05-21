package Arraysandarraylists.Questions;
import java.util.Scanner;
public class ReverseAnArray {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }print(arr);
        int i = 0;
        int j = n-1;
        while(j>=i){
            swap(arr,i,j);
            i++;
            j--;
        }
        print(arr);
    }
}