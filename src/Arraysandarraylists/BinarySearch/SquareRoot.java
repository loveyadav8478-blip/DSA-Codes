package Arraysandarraylists.BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sqrt(n));
    }
    static int sqrt(int n){
        int st = 0;
        int end = n;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st) / 2;
            int val = mid * mid;
            if (val == n) {
                return mid;
            } else if (val < n) {
                ans = mid;
                st = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}
