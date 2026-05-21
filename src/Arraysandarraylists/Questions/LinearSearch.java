package Arraysandarraylists.Questions;

public class LinearSearch  {
    public static void main(String[] args) {
        int[] arr = {1, 25, 45, 96, 25, 99};
        System.out.println(LinearSearch(arr,100));
        System.out.println(LinearSearch2(arr,100));
    }
    static int LinearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
    static int LinearSearch2(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return target;
            }
        }
        return -1;
    }
}

