package Graph.multiSourceBFS;

import kotlin.Pair;

import java.util.*;

public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] ans = new int[m][n];
        Queue<Pairs> q = new LinkedList<>();
        for(int i = 0; i< m; i++){
            for(int j = 0; j<n; j++){
                if(mat[i][j]==0){
                    ans[i][j] = 0;
                    q.add(new Pairs(i,j));
                }
                else{
                    ans[i][j] = -1;
                }
            }
        }

        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                Pairs p = q.poll();
                int i = p.i, j= p.j;
                for(int[] d : dir){
                    int nI = i+d[0], nJ = j+d[1];
                    if(nI>=0 && nJ>=0 && nI<m && nJ<n && ans[nI][nJ]==-1){
                        ans[nI][nJ] = 1+ans[i][j];
                        q.add(new Pairs(nI,nJ));
                    }
                }
            }
        }
        return ans;
    }
}
