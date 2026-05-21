package Dynammic_Programming;

public class Unbounded_Knapsack {
    public int knapSack(int val[], int wt[], int capacity){
        return helper(0,val,wt,capacity);
    }
    private int helper(int i, int[] val,int[] wt , int capacity) {
        if(i== val.length){
            return (capacity==0) ? 0:Integer.MIN_VALUE;
        }
        int pick = 0;
        if(capacity<wt[i]){
            pick = helper(i,val,wt,capacity-val[i]);
        }
        int skip = helper(i+1,val,wt,capacity);
        return Math.max(pick,skip);
    }
}
