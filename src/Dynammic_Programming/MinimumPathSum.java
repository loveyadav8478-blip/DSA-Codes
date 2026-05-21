package Dynammic_Programming;

import java.util.Arrays;

public class MinimumPathSum {



    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] mat = new int[m][n];
        for(int i = 0; i< m; i++){
            Arrays.fill(mat[i],-1);
        }
        return helper(0,0,mat,grid);
    }
    private int helper(int i, int j, int[][] mat, int[][] grid) {
        int m = mat.length;
        int n = mat[0].length;
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(i==m-1 && j==n-1) return grid[i][j];
        if(mat[i][j]!=-1) return mat[i][j];
        return mat[i][j] = grid[i][j] + Math.min(helper(i+1,j,mat,grid),helper(i,j+1,mat,grid));
    }
}
