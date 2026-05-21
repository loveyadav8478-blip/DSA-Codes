package Arraysandarraylists.BinarySearch;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(arr));
    }
    static int findPeakElement(int[] arr){
        int st = 0;
        int end = arr.length-1;
        while(st < end){
            int mid = st+(end-st)/2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }else{
                st = mid + 1;
            }
        }
        return st;
    }
}
