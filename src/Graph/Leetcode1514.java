//package Graph;
//
//import java.util.*;
//class Pairr{
//    int node;
//    double prob;
//    Pairr(int node,double prob){
//        this.node = node;
//        this.prob = prob;
//    }
//}
//public class Leetcode1514 {
//    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end){
//        List<List<Pair>> adj = new ArrayList<>();
//
//        for(int i = 0; i< n; i++) adj.add(new ArrayList<>());
//
//        for(int i = 0; i < edges.length; i++){
//            int u = edges[i][0];
//            int v = edges[i][1];
//            double w = succProb[i];
//            adj.get(u).add(new Pair(v,w));
//            adj.get(v).add(new Pair(u,w));
//        }
//
//        PriorityQueue<Pairr> pq = new PriorityQueue<>(new Comparator<Pairr>() {
//            @Override
//            public int compare(Pairr o1, Pairr o2) {
//                if(o1.prob==o2.prob) return o2.node- o1.node;
//                return Double.compare(o2.prob,o1.prob);
//            }
//        });
//        double[] cost = new double[n];
//        Arrays.fill(cost,Integer.MIN_VALUE);
//        cost[start] = 1;
//        pq.add(new Pairr(start,1));
//        while(!pq.isEmpty()){
//            Pairr p = pq.poll();
//            int node = p.node;
//            double prob = p.prob;
//            if(prob<cost[node]) continue;
//            for(var e : adj.get(node)){
//                double totalProb = prob * e.prob;
//                if(cost[e.node]<totalProb){
//                    cost[e.node] = totalProb;
//                    pq.add(new Pairr(e.node,totalProb));
//                }
//            }
//        }
//        if(cost[end]==Integer.MIN_VALUE) return 0;
//        return cost[end];
//    }
//}
