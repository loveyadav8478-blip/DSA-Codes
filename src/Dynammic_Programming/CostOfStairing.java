package Dynammic_Programming;
import java.util.Arrays;
public class CostOfStairing {
    public int minCostClimbingStair1s(int[] cost) {
        int n = cost.length;
        int[] temp = new int[3];
        temp[0] = cost[0];
        temp[1] = cost[1];
        for(int i =2; i< n; i++){
            temp[2] = cost[i]+Math.min(temp[0],temp[1]);
            temp[0] = temp[1];
            temp[1] = temp[2];
        }
        return Math.min(temp[0],temp[1]);
    }


    int[] temp;
    public int helper(int i, int[] arr){
        if(i>=arr.length) return 0;
        if(temp[i]!=Integer.MIN_VALUE) return temp[i];
        temp[i] = arr[i] + Math.min(helper(i+1,arr),helper(i+2,arr));
        return arr[i] + Math.min(helper(i+1,arr),helper(i+2,arr));
    }
    public int minCostClimbingStairs(int[] cost) {
        temp = new int[cost.length+1];
        Arrays.fill(temp,Integer.MIN_VALUE);
        return Math.min(helper(0,cost),helper(1,cost));
    }

    //Iterative dp
    static int mincostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] temp = new int[n];
        temp[0] = cost[0];
        temp[1] = cost[1];
        for(int i =2; i< n; i++){
            temp[i] = cost[i]+Math.min(temp[i-1],temp[i-2]);
        }
        return Math.min(temp[n-1],temp[n-2]);
    }
}
