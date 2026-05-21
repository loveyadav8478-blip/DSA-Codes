package Arraysandarraylists.BinarySearch;
public class FirstOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 5, 5, 5, 5, 6, 6, 6};
        System.out.println(firstOccurance(arr,5));
    }
    static int firstOccurance(int[] arr, int x){
        int s = 0;
        int h = arr.length-1;
        int fo = -1;
        while(s <= h){
            int mid = s + (h - s) / 2;
            if (arr[mid] == x) {
                fo = mid;
                h = mid - 1;
            } else if (arr[mid] > x) {
                h = mid - 1;
            }else{
               s = mid + 1;
            }
        }
        return fo;
    }
}
