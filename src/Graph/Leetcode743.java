package Graph;
import java.util.*;
public class Leetcode743 {
    class Pair{
        int node;
        int dist;
        Pair(int node, int dist){
            this.dist = dist;
            this.node = node;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0; i<= n; i++) adj.add(new ArrayList<>());
        for(int i = 0; i< times.length; i++){
            int u = times[i][0], v = times[i][1], w = times[i][2];
            adj.get(u).add(new Pair(v,w));
        }
        int[] cost = new int[n+1];
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.dist==o2.dist) return o1.node-o2.node;
                return o1.dist-o2.dist;
            }
        });
        Arrays.fill(cost,Integer.MAX_VALUE);
        cost[k] = 0;
        pq.add(new Pair(k,0));
        while(!pq.isEmpty()){
            Pair e = pq.poll();
            int node = e.node;
            int dist = e.dist;
            if(dist>cost[node]) continue;
            for(Pair p : adj.get(node)){
                int tDist = dist + p.dist;
                if(cost[p.node]>tDist){
                    pq.add(new Pair(p.node,tDist));
                    cost[p.node] = tDist;
                }
            }
        }
        int max = -1;
        for(int i = 1; i< cost.length; i++){
            if(cost[i]==Integer.MAX_VALUE) return -1;
            max = Math.max(max,cost[i]);
        }
        return max;
    }
}
