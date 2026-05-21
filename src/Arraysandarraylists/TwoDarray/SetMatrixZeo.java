package Arraysandarraylists.TwoDarray;
import java.util.*;
public class SetMatrixZeo {
    public static void main(String[] args) {
        int[][] arr = {
                {-1, 2, 3}
        };
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }
    static void setZeroes(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        boolean fstRow = false, fstCol = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 0){
                    if(i == 0) fstRow = true;
                    if(j == 0) fstCol = true;
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        //Fix Inner Matrix
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(arr[i][0] == 0 || arr[0][j] == 0) arr[i][j] = 0;
            }
        }
        //last remaining checks
        if(fstRow){
            for(int j = 0; j < m; j++)
                arr[0][j] = 0;
        }
        if(fstCol){
            for(int i = 0; i < n; i++)
                arr[i][0] = 0;
        }
    }
}
