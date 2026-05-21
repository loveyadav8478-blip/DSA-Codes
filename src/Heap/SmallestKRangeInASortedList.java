package Heap;
import java.util.*;
class Solution{
    public class Triplet implements Comparable<Triplet>{
        int ele;
        int row;
        int col;
        Triplet(int ele, int row, int col){
            this.ele = ele;
            this.row = row;
            this.col = col;
        }
        public int compareTo(Triplet t){
            return this.ele - t.ele;
        }
    }
    public ArrayList<Integer> findSmallestRange(int[][] mat) {
        int k = mat.length;
        int n = mat[0].length;
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for(int i = 0; i <k; i++){
            max = Math.max(max,mat[i][0]);
            min = Math.min(min,mat[i][0]);
            pq.add(new Triplet(mat[i][0],i,0));
        }
        int a = min, b= max;//[a,b] range
        while(true){
            Triplet top = pq.poll();
            int ele = top.ele, row = top.row, col = top.col;
            if(b-a>max-ele){
                a = ele;
                b = max;
            }
            if(col==n-1) break;
            int next = mat[row][col+1];
            max = Math.max(max,next);
            pq.add(new Triplet(next,row,col+1));
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        return ans;
    }
}
//public class SmallestKRangeInASortedList {
//
//}
