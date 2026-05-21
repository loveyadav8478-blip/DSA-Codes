package Graph;

public class NumberOfIslandByDFS {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] visited = new int[m][n];
        int count = 0;
        for(int i = 0; i<m; i++){
            for(int j =0 ; j< n; j++){
                if(grid[i][j]=='1' && visited[i][j]==0){
                    count++;
                    dfs(i,j,grid,visited);
                }
            }
        }
        return count;
    }

    private void dfs(int i, int j, char[][] grid, int[][] visited) {
        int m = grid.length, n = grid[0].length;
        if(i<m-1 && grid[i+1][j]=='1' && visited[i+1][j]==0)
            dfs(i+1,j,grid,visited);
        if(i-1>=0 && grid[i-1][j]=='1' && visited[i-1][j]==0)
            dfs(i-1,j,grid,visited);
        if(j<n-1 && grid[i][j+1]=='1' && visited[i][j+1]==0)
            dfs(i,j+1,grid,visited);
        if(j>=0 && grid[i][j-1]=='1' && visited[i][j-1]==0)
            dfs(i,j-1,grid,visited);
    }
}
