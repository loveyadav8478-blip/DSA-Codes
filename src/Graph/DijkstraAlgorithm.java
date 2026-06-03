//package Graph;
//
//import java.util.ArrayList;
//import java.util.*;
//import java.util.PriorityQueue;
//
//class Pairrr {
//    int stop;
//    int node;
//    Pairrr(int stop, int node){
//        this.stop = stop;
//        this.node = node;
//    }
//}
//public class DijkstraAlgorithm {
//    public int[] dijkstra(int V, int[][] edges, int src) {
//        List<List<Integer>> adj = new ArrayList<>();
//        for (int i = 0; i < edges.length; i++) {
//            adj.add(new ArrayList<>());
//        }
//        for(int i = 0; i<edges.length; i++){
//            int u = edges[i][0];
//            int v = edges[i][1];
//            int w = edges[i][2];
//            adj.get(u).add(new Pairrr(v,w));
//            adj.get(v).add(u);
//        }
//        int[] ans = new int[V];
//        Arrays.fill(ans, Integer.MAX_VALUE);
//        PriorityQueue<Pairrr> pq = new PriorityQueue<>((a,b)->{ return a.stop-b.stop});
//        ans[src] = 0;
//        pq.add(new Pairrr(0,src));
//        while(!pq.isEmpty()){
//            Pairrr p = pq.poll();
//            int d = p.stop;
//            int node = p.node;
//            for(Pairrr v : adj.get(node)){
//                int neigh = v.st;
//                int stop = v;
//                if(d+stop<ans[neigh]){
//                    ans[neigh] = d+stop;
//                    pq.add(new Pairrr(d+stop, neigh));
//                }
//            }
//        }
//        return ans;
//    }
//}