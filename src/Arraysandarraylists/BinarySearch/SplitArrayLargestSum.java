package Arraysandarraylists.BinarySearch;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] a = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(a,m));
    }
    static boolean isPossibleDestribute(int[] a, int m, int maxAllowed){
        int nos = 1;
        int choc = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > maxAllowed) return false;
            if(choc + a[i] <= maxAllowed) choc += a[i];
            else{
                nos++;
                choc = a[i];
            }
        }
        if(nos > m)
            return false;
        return true;
    }
    static int splitArray(int[] a, int m) {
        int st = 0;
        int end = 0;
        for (int i = 0; i < a.length; i++) {
            st = Math.max(st, a[i]);  // lower bound
            end += a[i];              // upper bound
        }

        int ans = 0;
        while(st <= end){
            int mid = st +(end - st)/2;
            if(isPossibleDestribute(a,m,mid)){
                ans = mid;
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }
        return ans;
    }
}
