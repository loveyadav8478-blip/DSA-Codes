//package Graph;
//
//import java.util.*;
//
//class Triplet{
//    int row;
//    int col;
//    int diff;
//    Triplet(int row, int col, int diff){
//        this.row = row;
//        this.col = col;
//        this.diff = diff;
//    }
//}
//public class Leetcode1613 {
//    public int minimumEffortPath(int[][] heights) {
//        int m = heights.length;
//        int n = heights[0].length;
//        int[][] arr = new int[m][n];
//        for(int i = 0; i<m; i++) Arrays.fill(arr[i],Integer.MAX_VALUE);
//        PriorityQueue<Triplet1> q = new PriorityQueue<>(new Comparator<Triplet1>() {
//            @Override
//            public int compare(Triplet1 o1, Triplet1 o2) {
//                return o1.diff-o2.diff;
//            }
//        });
//        q.add(new Triplet1(0,0,0));
//        arr[0][0] = 0;
//        int[] r = {-1,0,1,0};
//        int[] c = {0,-1,0,1};
//        while(!q.isEmpty()){
//            Triplet1 t = q.poll();
//            int i = t.row;
//            int j = t.col;
//            int diff = t.diff;
//            if(i == m-1 && j == n-1) return diff;
//            for(int k = 0; k< 4; k++){
//                int newRow = i+r[i];
//                int newCol = j+c[i];
//                if(newRow<0 || newCol<0 || newRow>m-1 || newCol>n-1) continue;
//                int minDiff = Math.abs(heights[i-1][j]-heights[i][j]);
//                int newEff = Math.max(diff,minDiff);
//                if(arr[i-1][j]>newEff){
//                    arr[i-1][j] = newEff;
//                    q.add(new Triplet1(i-1,j,newEff));
//                }
//            }
////            if(i-1>=0){
////                int minDiff = Math.abs(heights[i-1][j]-heights[i][j]);
////                int newEff = Math.max(diff,minDiff);
////                if(arr[i-1][j]>newEff){
////                    arr[i-1][j] = newEff;
////                    q.add(new Triplet1(i-1,j,newEff));
////                }
////            }
////            if(j-1>=0){
////                int minDiff = Math.abs(heights[i][j-1]-heights[i][j]);
////                int newEff = Math.max(diff,minDiff);
////                if(arr[i][j-1]>newEff){
////                    arr[i][j-1] = newEff;
////                    q.add(new Triplet1(i,j-1,minDiff));
////                }
////            }
////            if(i<m-1){
////                int minDiff = Math.abs(heights[i+1][j]-heights[i][j]);
////                int newEff = Math.max(diff,minDiff);
////                if(arr[i+1][j]>newEff){
////                    arr[i+1][j] = newEff;
////                    q.add(new Triplet1(i+1,j,newEff));
////                }
////            }
////            if(j<n-1){
////                int minDiff = Math.abs(heights[i][j+1]-heights[i][j]);
////                int newEff = Math.max(diff,minDiff);
////                if(arr[i][j+1]>newEff){
////                    arr[i][j+1] = Math.min(arr[i][j+1],newEff);
////                    q.add(new Triplet1(i,j+1,newEff));
////                }
////            }
//        }
//        return arr[m-1][n-1];
//    }
//}
