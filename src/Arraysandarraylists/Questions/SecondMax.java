package Arraysandarraylists.Questions;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {12,33,34,10,43};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max ) max = arr[i];
        }
        int smax = Integer.MIN_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > smax && arr[j] != max) smax = arr[j];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
