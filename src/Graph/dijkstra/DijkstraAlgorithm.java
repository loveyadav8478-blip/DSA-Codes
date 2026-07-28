package Graph.dijkstra;
import java.util.*;
class Pair{
    public int node;
    int n;
    int d;
    Pair(int n, int d){
        this.n = n;
        this.d = d;
    }
}
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        int[] ans = new int[V];
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src] = 0;
        List<List<Pair>> adj = new ArrayList<>();
        for(int i = 0; i< V; i++) adj.add(new ArrayList<>());
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            // @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.d == o2.d) return Integer.compare(o1.n,o2.n);
                return Integer.compare(o1.d,o2.d);
            }
        });
        pq.add(new Pair(src,0));
        for(int i = 0; i< edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int n = p.n;
            int d = p.d;
            if (d > ans[n]) continue;
            for(Pair e : adj.get(n)){
                int dist = e.d;
                int node = e.n;
                if(d+dist<ans[node]){
                    ans[node] = d+dist;
                    pq.add(new Pair(node,ans[node]));
                }
            }
        }
        return ans;

    }
}