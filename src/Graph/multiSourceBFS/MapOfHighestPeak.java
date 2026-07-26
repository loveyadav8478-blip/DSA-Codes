package Graph.multiSourceBFS;

import java.util.*;

public class MapOfHighestPeak {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] height = new int[m][n];
        Queue<Pairs> q = new LinkedList<>();
        for(int i = 0; i< m ; i++){
            for(int j = 0; j< n; j++){
                if(isWater[i][j]==1){
                    height[i][j] = 0;
                    q.add(new Pairs(i,j));
                }
                else{
                    height[i][j] = -1;
                }
            }
        }

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- >0){
                Pairs p = q.poll();
                for(int[] d : dir){
                    int nI = p.i+d[0];
                    int nJ = p.j+d[1];
                    if(nI>=0 && nJ>=0 && nI<m && nJ<n && height[nI][nJ]==-1){
                        height[nI][nJ] = 1 + height[p.i][p.j];
                        q.add(new Pairs(nI,nJ));
                    }
                }
            }
        }
        return height;
    }
}
