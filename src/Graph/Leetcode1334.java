package Graph;

import java.util.Arrays;

public class Leetcode1334 {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] arr = new int[n][n];
        for(int i = 0;i < n;i++){
            Arrays.fill(arr[i],Integer.MAX_VALUE);
        }
        for(int[] a : edges){
            int u = a[0];
            int v = a[1];
            int w = a[2];
            arr[u][v] = w;
            arr[v][u] = w;
        }
        for(int k = 0; k< n; k++){
            for(int i = 0; i< n; i++){
                if(i==k) continue;
                for(int j = 0; j< n; j++){
                    if(j==k) continue;
                    if(arr[i][k]!=Integer.MAX_VALUE && arr[k][j]!=Integer.MAX_VALUE){
                        arr[i][j] = Math.min(arr[i][j],arr[i][k]+arr[k][j]);
                    }
                }
            }
        }
        int minC = -1;
        int minCount = Integer.MAX_VALUE;
        for(int i = 0; i< n; i++){
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(i==j) continue;
                if(arr[i][j]<=distanceThreshold){
                    count++;
                }
            }
            if(count<=minCount){
                minCount = count;
                minC = i;
            }
        }
        return minC;
    }
}
