package Heap;
import java.util.*;
public class KthClosestPointFromOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int[] p : points){
            int x = p[0];
            int y = p[1];
            int dist = x*x + y*y;
            pq.add(new Triplet(dist,x,y));
            if(pq.size()>k) pq.remove();
        }
        int[][] ans = new int[k][2];
        for(int i = 0; i<k; i++){
            Triplet top = pq.remove();
            ans[i][0] = top.x;
            ans[i][1] = top.y;
        }
        return ans;
    }

    static class Triplet implements Comparable<Triplet> {
        int dist;
        int x;
        int y;

        Triplet(int dist, int x, int y) {
            this.dist = dist;
            this.x = x;
            this.y = y;
        }

        public int compareTo(Triplet t) {
            return this.dist = t.dist;
        }
    }
}
