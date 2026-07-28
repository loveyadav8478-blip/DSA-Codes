package Graph.dijkstra;

import java.util.*;

class P{
    int n;
    int d;
    P(int n, int d){
        this.d = d;
        this.n = n;
    }
}
public class ShortestPathInUndirectedGraph {
    public ArrayList<Integer> shortestPath(int V, int[][] edges, int src, int dest) {
        List<List<P>> adj = new ArrayList<>();
        PriorityQueue<P> pq = new PriorityQueue<>(new Comparator<P>() {
            @Override
            public int compare(P o1, P o2) {
                return Integer.compare(o1.d,o2.d);
            }
        });

        ArrayList<Integer> a = new ArrayList<>();

        for(int i = 0; i<= V; i++) adj.add(new ArrayList<>());

        for(int i = 0; i< edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adj.get(u).add(new P(v,w));
            adj.get(v).add(new P(u,w));
        }

        int[] ans = new int[V+1];

        Arrays.fill(ans,Integer.MAX_VALUE);

        int[] par = new int[V+1];

        for(int i = 0; i< V+1; i++){
            par[i] = i;
        }

        ans[src] = 0;
        pq.add(new P(src,0));
        while(!pq.isEmpty()){
            P p = pq.poll();
            int d = p.d;
            int n = p.n;
            if (d > ans[n]) continue;
            for(P e : adj.get(n)){
                int node = e.n;
                int dist = e.d;
                if(d+dist<ans[node]){
                    par[node] = n;
                    ans[node] = d+dist;
                    pq.add(new P(node,ans[node]));
                }
            }
        }
        ArrayList<Integer> path = new ArrayList<>();
        int node = dest;
        if(ans[node]==Integer.MAX_VALUE){
            path.add(-1);
            return path;
        }
        while(par[node]!=node){
            path.add(node);
            node = par[node];
        }
        path.add(src);
        Collections.reverse(path);
        return path;
    }
}
