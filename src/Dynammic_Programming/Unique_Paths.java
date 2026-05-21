package Dynammic_Programming;

import java.util.Arrays;

public class Unique_Paths {
//    public int uniquePaths(int m, int n) {
//        if(m==1 || n==1) return 1;
//        return uniquePaths(m-1,n)+uniquePaths(m,n-1);
//    }

//    public int numberOfPaths(int m, int n) {
//        int[][] mat = new int[2][n];
//        for(int i = 0;i<m; i++){
//            for(int j = 0; j<n; j++){
//                mat[0][j] = 1;
//            }
//        }
//        mat[1][0] =1;
//        for(int )
//    }



//    int[][] mat;
//    public int helper(int i, int j){
//        if(i == 1 || j == 1) return 1;
//        if(mat[i][j]!=-1) return mat[i][j];
//        return mat[i][j] = helper(i-1,j) + helper(i,j-1);
//    }
//    public int uniquePaths(int m, int n) {
//        mat = new int[m+1][n+1];
//        for(int i = 0; i<= m; i++){
//            Arrays.fill(mat[i],-1);
//        }
//        return helper(m,n);
//    }

    //Iterative method
//    public int numberOfPaths(int m, int n) {
//        int[][] mat = new int[m+1][n+1];
//        return helper(m,n,mat);
//    }
//    public int helper(int m, int n, int[][] mat){
//        for(int i=0; i<m; i++){
//            mat[i][0] = 1;
//        }
//        for(int j=0; j<n; j++){
//            mat[0][j] = 1;
//        }
//
//        for(int i = 1; i<m; i++){
//            for(int j = 1; j< n;j++){
//                mat[i][j] = mat[i-1][j] + mat[i][j-1];
//            }
//        }
//        return mat[m-1][n-1];
//    }
}
