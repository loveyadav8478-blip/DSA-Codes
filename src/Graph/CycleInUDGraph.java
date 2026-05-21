package Graph;

import java.util.*;

public class CycleInUDGraph {
    class Pair{
        int node;
        int parent;
        Pair(int node, int parent){
            this.node = node;
            this.parent = parent;
        }
    }
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i< V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i< edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[] visited = new int[V];
        for(int i = 0; i<V; i++){
            if(visited[i]==0 && dfs(i,-1,visited,adj)) return true;
        }
        return false;
    }

    private boolean dfs(int node,int par, int[] visited, List<List<Integer>> adj) {
        visited[node] = 1;
        for(int e : adj.get(node)){
            if(visited[e]!=1){
                if(dfs(e,node,visited,adj)) return true;
                visited[e] = 1;
            }
            else if(e != par) return true;
        }
        return false;
    }

    private boolean bfs(int node, int[] visited, List<List<Integer>> adj) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(node,-1));
        visited[node] = 1;
        while(q.size()!=0){
            Pair p = q.poll();
            int par = p.parent;
            int n = p.node;
            for(int e : adj.get(n)){
                if(visited[e]!=1){
                    q.add(new Pair(e,n));
                    visited[e] = 1;
                }
                else if(e != par) return true;
            }
        }
        return false;
    }
}
