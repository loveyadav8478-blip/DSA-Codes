package Arraysandarraylists.Questions;
import java.util.Scanner;
public class Max{
    public static void main(String[] args) {
        int[] arr = {100, 2, 45, 8, 0, 77, 98};
        Scanner sc = new Scanner(System.in);
        maxlim(arr,0,3);
//        max(arr);
    }

    static void maxlim(int[] arr,int index1, int index2) {
        int maxVal = arr[index1];
        for (int i = index1; i <= index2; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        System.out.println(maxVal);
    }

    static void max(int[] arr) {
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        System.out.println(maxVal);
    }
}
