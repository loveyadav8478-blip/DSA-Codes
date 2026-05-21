package Arraysandarraylists.BinarySearch;

public class RaceTrackKids {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 9};
        int K = 3;
        System.out.println(raceTrack(arr,K));
    }
    static int raceTrack(int[] arr, int K){
        int n = arr.length;
        if (K > n) return -1;
        int st = 0;
        int end = arr[n-1]-arr[0];
        int ans = -1;
        while(st <= end){
            int mid = st +(end - st)/2;
            if (isPossible(arr,K,mid)) {
                ans = mid;
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

    static boolean isPossible(int[] arr, int K, int dist){
        int nok = 1;
        int lastKid = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - lastKid >= dist){
             nok++;
             lastKid = arr[i];
            }
        }
        if(nok >= K) return true;
        return false;
    }
}
