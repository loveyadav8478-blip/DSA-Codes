package Arraysandarraylists.Questions;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,5));
    }
    static int searchInsert(int[] arr, int target){
        int st = 0,ed = arr.length-1;
        while(st <= ed){
            int mid = st+(ed-st)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if(arr[mid] < target){
                st = mid + 1;
            }
            else{
                ed = mid - 1;
            }
        }
        return st;
    }
}
