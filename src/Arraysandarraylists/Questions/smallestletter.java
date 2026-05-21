package Arraysandarraylists.Questions;

public class smallestletter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        System.out.println(smallestLetter(arr, 'c')); // pass char
    }
    public static char smallestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2; // avoid overflow
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start % arr.length];
    }
}
