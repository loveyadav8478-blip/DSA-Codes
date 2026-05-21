package Dynammic_Programming;

public class Minimum_Path_Sum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] mat = new int[m][n];
        int csum = 0;
        int rsum = 0;
        for(int j =0; j<n; j++){
            csum += grid[0][j];
            mat[0][j] = csum;
        }
        for(int i =0; i<m; i++){
            rsum += grid[i][0];
            mat[i][0] = rsum;
        }
        for(int i = 1; i<m; i++){
            for(int j = 1; j <n ;j++){
                mat[i][j] = grid[i][j] + Math.min(mat[i-1][j],mat[i][j-1]);
            }
        }
        return mat[m-1][n-1];
    }
}
