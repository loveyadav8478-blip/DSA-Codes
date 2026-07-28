package Graph.dijkstra;

import java.util.*;

//class Pair{
//    int n;
//    int d;
//    Pair(int n, int d){
//        this.n = n;
//        this.d = d;
//    }
//}
public class NetworkTimeDelay {
    public int networkDelayTime(int[][] edges, int N, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        int[] ans = new int[N+1];
        int[] par = new int[N+1];
        for(int i = 0; i<= N; i++) adj.add(new ArrayList<>());
        for(int i = 0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adj.get(u).add(new Pair(v,w));
        }

        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[0] = -1;
        ans[k] = 0;
        for(int i = 0; i<=N ;i++) par[i] = i;

        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2){
                if(o1.d==o2.d) return Integer.compare(o1.n,o2.n);
                return Integer.compare(o1.d,o2.d);
            }
        });
        pq.add(new Pair(k,0));

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int n = p.n;
            int d = p.d;
            for(Pair e : adj.get(n)){
                int node = e.n;
                int dist = e.d;
                if(d+dist<ans[node]){
                    ans[node] = d+dist;
                    pq.add(new Pair(node,ans[node]));
                    par[node] = n;
                }
            }
        }


        int a = Integer.MIN_VALUE;
        for(int i= 0; i<ans.length; i++) a = Math.max(a,ans[i]);
        return (a==Integer.MAX_VALUE) ? -1 : a;
    }
}
