package Graph;
import java.util.*;
public class BipartiteGraph {
    public boolean bfs(int node, List<List<Integer>> adj, int[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = 1;
        while(q.size()!=0){
            int t = q.poll();
            for(int e : adj.get(t)){
                if(visited[e]==0){
                    if(visited[node]==1){
                        visited[e] = 2;
                    }
                    else if(visited[node]!=1){
                        visited[e] = 1;
                    }
                    q.add(e);
                }
                else if(visited[node]==visited[e]) return false;
            }
        }
        return true;
    }
    public boolean dfs(int node, List<List<Integer>> adj, int[] visited){
        for(int e : adj.get(node)){
            if(visited[e]==0){
                if(visited[node]==1){
                    visited[e] = 2;
                }
                else if(visited[node]!=1){
                    visited[e] = 1;
                }
                dfs(e,adj,visited);
            }
            else if(visited[node]==visited[e]) return false;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i< n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i< n; i++){
            for(int e : graph[i]){
                adj.get(i).add(e);
            }
        }
        int[] visited = new int[n];
        for(int i = 0; i<n ; i++){
            if(visited[i]==0 && dfs(i,adj,visited)){
                return true;
            }
        }
        return false;
    }


    class Solution {
        boolean bool;
        public void dfs(int node, int[][] adj, int[] visited){

            for(int e : adj[node]){
                if(visited[e]==0){
                    if(visited[node]==1){
                        visited[e] = 2;
                    }
                    else if(visited[node]==2){
                        visited[e] = 1;
                    }
                    dfs(e,adj,visited);
                }
                if(visited[node]==visited[e]){
                    bool = false;
                    return;
                }
            }
            bool = true;
        }
        public boolean isBipartite(int[][] graph) {
            bool = true;
            int n = graph.length;
            int[] visited = new int[n];
            for(int i = 0; i< n; i++){
                if(visited[i]==0){
                    visited[i] = 1;
                    dfs(i,graph,visited);
                }
            }
            return bool;
        }
    }
}
