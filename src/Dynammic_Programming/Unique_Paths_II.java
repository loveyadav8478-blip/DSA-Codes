package Dynammic_Programming;

import java.util.Arrays;

public class Unique_Paths_II {
    class Solution {
        public int helper(int i, int j, int[][] mat){
            if(i<0 || j<0) return 0;
            if(mat[i][j]==-2) return 0;
            if(i==0 && j==0) return 1;
            if(mat[i][j]!=-1) return mat[i][j];
            return mat[i][j] = helper(i-1,j,mat) + helper(i,j-1,mat);
        }
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            int[][] mat = new int[m][n];
            for (int i = 0; i < m; i++) {
                for(int j = 0; j< n; j++){
                    if(obstacleGrid[i][j]==1){
                        mat[i][j] = -2;//obstacle
                    }else{
                        mat[i][j] = -1;
                    }
                }
            }
            return helper(m-1,n-1,mat);
        }
    }
}
