package Graph;

import java.util.*;

class Triplet1 {
    int node;
    int dist;
    int par;
    Triplet1(int node, int par, int dist){
        this.node = node;
        this.par = par;
        this.dist = dist;
    }
}
public class Leetcode1584 {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[] visited = new int[n];
        int ans = 0;

        PriorityQueue<Triplet1> pq = new PriorityQueue<>(new Comparator<Triplet1>() {
            @Override
            public int compare(Triplet1 o1, Triplet1 o2) {
                return (o1.dist==o2.dist) ? o1.node-o2.node : o1.dist-o2.dist;
            }
        });

        pq.add(new Triplet1(0,-1,0));

        while(!pq.isEmpty()){
            Triplet1 p = pq.poll();
            int node = p.node, dist = p.dist, par = p.par;
            if(visited[node]==1) continue;
            visited[node] = 1;
            ans += dist;
            for(int i = 0; i< n; i++){
                if(i==node) continue;
                if(i==par) continue;
                if(visited[i]==1) continue;
                int x1 = points[node][0];
                int y1 = points[node][1];
                int x2 = points[i][0];
                int y2 = points[i][1];
                int mD = Math.abs(x1-x2) + Math.abs(y1-y2);
                pq.add(new Triplet1(i,node,mD));
            }

        }

        return ans;
    }
}
