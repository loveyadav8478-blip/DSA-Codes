package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Island{
    int i;
    int j;
    int[] peri;
    Island(int i, int j){
        this.i = i;
        this.j = j;
    }
}
public class IslandPerimeter {
    public static void main(String[] args) {
        System.out.println(islandPerimeter(new int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}}));
    }
    public static void bfs(int[][] grid, Island iL, int[][] visited, int[] peri){
        int m = grid.length;
        int n = grid[0].length;
        Queue<Island> q = new LinkedList<>();
        q.add(iL);
        visited[iL.i][iL.j] = 1;
        while(!q.isEmpty()){
            Island e = q.poll();
            int i = e.i;
            int j = e.j;
            int up = 0, dn = 0, rt = 0, lt = 0;
            if(i+1<m && grid[i+1][j]==1){
                dn++;
                if(visited[i+1][j]==0){
                    visited[i+1][j]=1;
                    q.add(new Island(i+1,j));
                }
            }
            if(j+1<n && grid[i][j+1]==1){
                rt++;
                if(visited[i][j+1]==0){
                    visited[i][j+1]=1;
                    q.add(new Island(i,j+1));
                }
            }
            if(i-1>=0 && grid[i-1][j]==1){
                up++;
                if(visited[i-1][j]==0){
                    visited[i-1][j]=1;
                    q.add(new Island(i-1,j));
                }
            }
            if(j-1>=0 && grid[i][j-1]==1){
                lt++;
                if(visited[i][j-1]==0){
                    visited[i][j-1]=1;
                    q.add(new Island(i,j-1));
                }
            }
            peri[0] += 4-(lt+dn+up+rt);
        }
    }
    public static int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] peri = {0};
        int[][] visited = new int[m][n];
        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(grid[i][j]==1 && visited[i][j]==0){
                    bfs(grid,new Island(i,j),visited,peri);
                }
            }
        }
        return peri[0];
    }
}
