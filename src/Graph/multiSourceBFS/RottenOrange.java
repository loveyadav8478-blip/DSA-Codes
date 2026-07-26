package Graph.multiSourceBFS;

import java.util.*;

class Pairs{
    int i;
    int j;
    Pairs(int i, int j){
        this.i = i;
        this.j = j;
    }
}
public class RottenOrange {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh = 0;
        int min = 0;
        Queue<Pairs> q = new LinkedList<>();
        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(grid[i][j]==1){
                    fresh++;
                }
                else if(grid[i][j]==2){
                    q.add(new Pairs(i,j));
                }
            }
        }

        while(!q.isEmpty()){
            int size = q.size();
            while(size-->0){
                Pairs p = q.poll();
                int i = 0;
                int j = 0;
                if(i+1<m && grid[i+1][j]==1){
                    grid[i+1][j] = 2;
                    fresh--;
                    q.add(new Pairs(i+1,j));
                }
                if(j+1<n && grid[i][j+1]==1){
                    grid[i][j+1] = 2;
                    fresh--;
                    q.add(new Pairs(i,j+1));
                }
                if(i-1>=0 && grid[i-1][j]==1){
                    grid[i-1][j] = 2;
                    fresh--;
                    q.add(new Pairs(i-1,j));
                }
                if(j-1>=0 && grid[i][j-1]==1){
                    grid[i][j-1] = 2;
                    fresh--;
                    q.add(new Pairs(i,j-1));
                }
            }
            if(!q.isEmpty()){
                min++;
            }
        }
        return fresh==0 ? min : -1;
    }
}
