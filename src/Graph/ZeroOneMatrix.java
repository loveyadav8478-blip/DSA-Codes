//package Graph;
//import java.util.*;
//
//class Triplet{
//    int i;
//    int j;
//    int d;
//    Triplet(int i, int j, int d){
//        this.i = i;
//        this.j = j;
//        this.d = d;
//    }
//}
//public class ZeroOneMatrix {
//    public void bfs(Triplet t, int[][] mat, int[][] nums){
//        Queue<Triplet> q = new LinkedList<>();
//        q.add(new Triplet(t.i,t.j,t.d));
//
//    }
//    public int[][] updateMatrix(int[][] mat) {
//        int m = mat.length;
//        int n = mat[0].length;
//        int[][] ans = new int[m][n];
//        for(int i = 0; i< m; i++){
//            for(int j = 0; j< n; j++){
//                if(mat[i][j]==1){
//                    bfs(new Triplet(i,j,0),mat,ans);
//                }
//            }
//        }
//    }
//}
