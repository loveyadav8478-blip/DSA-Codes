package Arraysandarraylists;

public class my {
    public static void main(String[] args) {
        int n = 5;
        int temp = n;
        int[] arr = new int[n];
        for(int i = n-1; i>= 0; i--){
            arr[i] = temp--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
