package Dynammic_Programming;

public class CountSquareSubmatriceswithAllOnes {
    public int countSquares(int N, int M, int mat[][]) {
        int n = M,m = N;
        int count = 0;
        for(int j = 0; j<m; j++){
            if(mat[0][j] == 1) count++;
        }
        for(int i = 0; i<n; i++){
            if(mat[i][0] == 1) count++;
        }
        for(int i = 1; i<n; i++){
            for(int j = 1; j< m; j++){
                int ele = Math.min(mat[i-1][j],Math.min(mat[i][j-1],mat[i-1][j-1]));
                mat[i][j] += ele;
                count += mat[i][j];
            }
        }
        return count;
    }
}
