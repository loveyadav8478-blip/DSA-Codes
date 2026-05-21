package Graph;
import java.util.*;
public class CheckPathIfExist {
    public void dfs(int i, int destination,List<List<Integer>> adj, int[] visited,boolean[] bool){
        visited[i] = 1;
        if(i==destination){
            bool[0] = true;
            return;
        }
        for(var v : adj.get(i)){
            if(visited[v]==0){
                visited[v] = 1;
                dfs(v,destination,adj,visited,bool);
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Queue<Integer> q = new LinkedList<>();
        List<List<Integer>> adj = new ArrayList<>();
        boolean[] bool = new boolean[1];
        bool[0] = false;
        for(int i = 0; i< n; i++){
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int[]  visited = new int[n];
        dfs(source,destination,adj,visited,bool);
        return bool[0];
    }
//    public boolean validPath(int n, int[][] edges, int source, int destination) {
//        Queue<Integer> q = new LinkedList<>();
//        List<List<Integer>> adj = new ArrayList<>();
//        boolean bool2 = false;
//        for(int i = 0; i< n; i++){
//            adj.add(new ArrayList<>());
//        }
//        for (int[] edge : edges) {
//            int u = edge[0];
//            int v = edge[1];
//            adj.get(u).add(v);
//            adj.get(v).add(u);
//        }
//        int[]  visited = new int[n];
//        visited[source] = 1;
//        q.add(source);
//        while(!q.isEmpty()){
//            int e = q.poll();
//            if(e==destination) return true;
//            for(var v : adj.get(e)){
//                if(visited[v]==0){
//                    q.add(v);
//                    visited[v] = 1;
//                }
//            }
//        }
//        return bool2;
//    }
}
