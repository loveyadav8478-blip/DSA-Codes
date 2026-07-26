package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pairrr{
    int i;
    int j;
    Pairrr(int i, int j){
        this.i = i;
        this.j = j;
    }
}
public class MaxAreaOfIsland {
    public void bfs(Pairrr p, boolean[][] visited, int[][] grid, int[] ans){
        int area = 1;
        int m = grid.length;
        int n = grid[0].length;
        Queue<Pairrr> q = new LinkedList<>();
        visited[p.i][p.j] = true;

        q.add(p);
        while(!q.isEmpty()){
            Pairrr e = q.poll();
            int i = e.i;
            int j = e.j;
            if(i-1>=0 && !visited[i-1][j] && grid[i-1][j]==1){
                visited[i-1][j] = true;
                q.add(new Pairrr(i-1,j));
                area++;
            }
            if(i<m-1 && !visited[i+1][j] && grid[i+1][j]==1){
                visited[i+1][j] = true;
                q.add(new Pairrr(i+1,j));
                area++;
            }if(j-1>=0 && !visited[i][j-1] && grid[i][j-1]==1){
                visited[i][j-1] = true;
                q.add(new Pairrr(i,j-1));
                area++;
            }if(j<n-1 && !visited[i][j+1] && grid[i][j+1]==1){
                visited[i][j+1] = true;
                q.add(new Pairrr(i,j+1));
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
                    bfs(new Pairrr(i,j),visited,grid,ans);
                    a = Math.max(ans[0],a);
                }
            }
        }
        return (a == Integer.MIN_VALUE) ? 0 : a;
    }
}
