package Arraysandarraylists.Questions;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum  = 0;
        System.out.print("Enter the elements : ");
        for (int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("array is :  ");
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i]+" ");
            sum += arr[i];
        }
        System.out.println();
        System.out.print("Sum of the elements is: "+sum);
    }
}
