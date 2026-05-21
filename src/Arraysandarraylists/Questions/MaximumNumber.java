package Arraysandarraylists.Questions;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {12,33,34,100,43};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ) {
                max = arr[i];
            }
        }
        System.out.print(max);
    }
}
