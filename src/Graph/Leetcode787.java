package Graph;
import java.util.*;
class Pair1{
    int node;
    int cost;
    Pair1(int node, int cost){
        this.node = node;
        this.cost = cost;
    }
}
class Tuple{
    int node;
    int cost;
    int stops;
    Tuple(int node,int cost, int stops){
        this.node = node;
        this.cost = cost;
        this.stops  = stops;
    }
}
public class Leetcode787 {
    public int findCheapestPriceBfs(int n, int[][] flights, int src, int dst, int k) {
        List<List<Tuple>> adj = new ArrayList<>();
        for(int i = 0; i<n;i++) adj.add(new ArrayList<>());

        for(int i = 0; i< flights.length; i++){
            int u = flights[i][0];
            int v = flights[i][1];
            int w = flights[i][2];
            adj.get(u).add(new Tuple(v,w,0));
        }

        PriorityQueue<Tuple> q = new PriorityQueue<>((a,b) -> a.cost - b.cost);

        q.add(new Tuple(src,0,0));

        while(!q.isEmpty()){
            Tuple top = q.poll();
            int node = top.node, cost = top.cost, stops = top.stops;

            if(node == dst) return cost;

            if(stops > k) continue;

            for(var e : adj.get(node)){
                q.add(new Tuple(e.node, cost + e.cost, stops + 1));
            }
        }

        return -1;
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] ans = new int[n];
        List<List<Pair1>> adj = new ArrayList<>();
        for(int i = 0; i<n;i++) adj.add(new ArrayList<>());

        for(int i = 0; i< flights.length; i++){
            int u = flights[i][0];
            int v = flights[i][1];
            int w = flights[i][2];
            adj.get(u).add(new Pair1(v,w));
        }

        PriorityQueue<Tuple> q = new PriorityQueue<>(new Comparator<Tuple>() {
            @Override
            public int compare(Tuple o1, Tuple o2) {
                return o1.cost -o2.cost;
            }
        });
        Arrays.fill(ans,Integer.MAX_VALUE);
        ans[src] = 0;
        q.add(new Tuple(src,0,0));
        while(!q.isEmpty()){
            Tuple top = q.poll();
            int node = top.node, cost = top.cost, stops = top.stops;
            if(node==dst) return cost;
            if(stops>k+1) continue;
            for(Pair1 p : adj.get(node)){
                int tCost = p.cost + cost;
                if(tCost < ans[p.node]){
                    ans[p.node] = tCost;
                    q.add(new Tuple(p.node,p.cost,stops+1));
                }
            }
        }
        return ans[dst];
    }
}
