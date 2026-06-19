package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pairr{
    int i;
    int j;
    Pairr(int i, int j){
        this.i = i;
        this.j = j;
    }
}
public class MaxAreaOfIsland {
    public void bfs(Pairr p, boolean[][] visited, int[][] grid, int[] ans){
        int area = 1;
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pairr> q = new LinkedList<>();
        visited[p.i][p.j] = true;
        q.add(p);
        while(!q.isEmpty()){
            Pairr e = q.poll();
            int i = e.i;
            int j = e.j;
            if(i-1>=0 && !visited[i-1][j] && grid[i-1][j]==1){
                visited[i-1][j] = true;
                q.add(new Pairr(i-1,j));
                area++;
            }
            if(i<m-1 && !visited[i+1][j] && grid[i+1][j]==1){
                visited[i+1][j] = true;
                q.add(new Pairr(i+1,j));
                area++;
            }if(j-1>=0 && !visited[i][j-1] && grid[i][j-1]==1){
                visited[i][j-1] = true;
                q.add(new Pairr(i,j-1));
                area++;
            }if(j<n-1 && !visited[i][j+1] && grid[i][j+1]==1){
                visited[i][j+1] = true;
                q.add(new Pairr(i,j+1));
                area++;
            }
        }
        ans[0] = area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int[] ans = {0};
        int a = Integer.MIN_VALUE;
        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(!visited[i][j] && grid[i][j]==1){
                    bfs(new Pairr(i,j),visited,grid,ans);
                    a = Math.max(ans[0],a);
                }
            }
        }
        return (a == Integer.MIN_VALUE) ? 0 : a;
    }
}
