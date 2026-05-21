package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland {
    class Pair{
        int r;
        int c;
        Pair(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    class Solution {
        public void bfs(Pair pair, char[][] grid, int[][] visited){
            int m = grid.length;
            int n = grid[0].length;
            Queue<Pair> q = new LinkedList<>();
            q.add(pair);
            visited[pair.r][pair.c] = 1;
            while(q.size()!=0){
                Pair p = q.poll();
                int row = p.r;
                int col = p.c;
                if(col-1>=0 && grid[row][col-1]=='1' && visited[row][col-1]==0){
                    visited[row][col-1] = 1;
                    q.add(new Pair(row,col-1));
                }
                if(col<n-1 && grid[row][col+1]=='1' && visited[row][col+1]==0){
                    visited[row][col+1] = 1;
                    q.add(new Pair(row,col+1));
                }
                if(row-1>=0 && grid[row-1][col]=='1' && visited[row-1][col]==0){
                    visited[row-1][col] = 1;
                    q.add(new Pair(row-1,col));
                }
                if(row<m-1 && grid[row+1][col]=='1' && visited[row+1][col]==0){
                    visited[row+1][col] = 1;
                    q.add(new Pair(row+1,col));
                }
            }
        }
        public int numIslands(char[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            int[][] visited = new int[m][n];
            int count = 0;
            for(int i = 0; i< m; i++){
                for(int j = 0; j<n; j++){
                    if(grid[i][j]=='1' && visited[i][j]==0){
                        count++;
                        bfs(new Pair(i,j),grid,visited);
                    }
                }
            }
            return count;
        }
    }
}
