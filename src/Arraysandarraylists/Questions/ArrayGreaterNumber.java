package Arraysandarraylists.Questions;
import java.util.Scanner;
public class ArrayGreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
             arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number would you find greater : ");
        int a = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) {
             count++;
            }
        }
        System.out.print(count);
    
    
    }    
    
}
