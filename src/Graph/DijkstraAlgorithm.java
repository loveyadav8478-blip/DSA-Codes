//package Graph;
//
//import java.util.ArrayList;
//import java.util.*;
//import java.util.PriorityQueue;
//
//class Pair{
//    int stop;
//    int node;
//    Pair(int stop,int node){
//        this.stop = stop;
//        this.node = node;
//    }
//}
//public class DijkstraAlgorithm {
//    public int[] dijkstra(int V, int[][] edges, int src) {
//        List<List<Integer>> adj = new ArrayList<>();
//        for(int i = 0; i<edges.length; i++){
//            int u = edges[i][0];
//            int v = edges[i][1];
//            adj.get(u).add(v);
//            adj.get(v).add(u);
//        }
//        int[] ans = new int[V];
//        Arrays.fill(ans, Integer.MAX_VALUE);
//        PriorityQueue<Pair> pq = new PriorityQueue<>();
//        ans[src] = 0;
//        pq.add(new Pair(0,src));
//        while(!pq.isEmpty()){
//            Pair p = pq.poll();
//            int d = p.stop;
//            int node = p.node;
//            for(var v : adj.get(node)){
////                int neigh = v.node;
////                int stop = v;
////                if(d+stop<ans[neigh]){
////                    ans[neigh] = d+stop;
////                    pq.add(new Pair(d+stop, neigh));
////                }
////            }
////        }
////        return ans;
////    }
////}