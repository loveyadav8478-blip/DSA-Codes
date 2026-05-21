package Graph;

import java.util.*;

public class ShortestPathInBinaryMatrix {
    class Triplet{
        int r;
        int c;
        int dist;
        Triplet(int dist, int r, int c){
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }
    public int bfs(Triplet triplet, int[][] grid, int[][] visited){
        int n = grid.length;
        Queue<Triplet> q = new LinkedList<>();

        q.add(new Triplet(triplet.dist,triplet.r,triplet.c));
        visited[triplet.r][triplet.c] = 1;

        while(q.size()!=0){
            Triplet e = q.poll();
            int d = e.dist;
            int r = e.r;
            int c = e.c;
            if(r==n-1 && c==n-1) return d;
            if(c-1>=0 && grid[r][c-1]==0 && visited[r][c-1]==0){
                q.add(new Triplet(d+1,r,c-1));
                visited[r][c-1] = 1;
            }
            if(c<n-1 && grid[r][c+1]==0 && visited[r][c+1]==0){
                q.add(new Triplet(d+1,r,c+1));
                visited[r][c+1] = 1;
            }

            if(r<n-1 && grid[r+1][c]==0 && visited[r+1][c]==0){
                q.add(new Triplet(d+1,r+1,c));
                visited[r+1][c] = 1;
            }
            if(r-1>=0 && grid[r-1][c]==0 && visited[r-1][c]==0){
                q.add(new Triplet(d+1,r-1,c));
                visited[r-1][c] = 1;
            }

            if(r-1>=0 && c-1>=0 && grid[r-1][c-1]==0 && visited[r-1][c-1]==0){
                q.add(new Triplet(d+1,r-1,c-1));
                visited[r-1][c-1] = 1;
            }
            if(r-1>=0 && c<n-1 && grid[r-1][c+1]==0 && visited[r-1][c+1]==0){
                q.add(new Triplet(d+1,r-1,c+1));
                visited[r-1][c+1] = 1;
            }

            if(r<n-1 && c-1>=0 && grid[r+1][c-1]==0 && visited[r+1][c-1]==0){
                q.add(new Triplet(d+1,r+1,c-1));
                visited[r+1][c-1] = 1;
            }
            if(c<n-1 && r<n-1 && grid[r+1][c+1]==0 && visited[r+1][c+1]==0){
                q.add(new Triplet(d+1,r+1,c+1));
                visited[r+1][c+1] = 1;
            }
        }
        return triplet.dist;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1) return -1;
        int n = grid.length;
        if(n==1 && grid[0][0]==0) return 1;
        if(grid[n-1][n-1]==1) return -1;
        int[][] visited = new int[n][n];
        int ans = bfs(new Triplet(1,0,0),grid,visited);
        return (ans==1) ? -1 : ans;
    }
}
