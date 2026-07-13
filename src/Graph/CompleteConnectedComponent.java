package Graph;
import java.util.*;
public class CompleteConnectedComponent {
    public int[] bfs(int node, List<List<Integer>> adj, int[] visited, int[] inDeg){
        Queue<Integer> q = new LinkedList<>();
        int[] pair = {0,0};
        visited[node] = 1;
        q.add(node);
        while(!q.isEmpty()){
            int e = q.poll();
            pair[0]++;
            pair[1] += inDeg[e];
            for(int ele : adj.get(e)){
                if(visited[ele]==0){
                    visited[ele] = 1;
                    q.add(ele);
                }
            }
        }
        return pair;
    }

    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i< n; i++) adj.add(new ArrayList<>());
        for(int i = 0; i< edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] inDeg = new int[n];
        for(int i = 0; i< n; i++){
            inDeg[i] += adj.get(i).size();
        }

        int[] visited = new int[n];
        int count = 0;
        for(int i = 0; i< n; i++){
            if(visited[i]==0){
                int[] pair = bfs(i,adj,visited,inDeg);
                int node = pair[0];
                int e = pair[1];
                if(e==(node*(node-1))){
                    count++;
                }
            }
        }
        return count;
    }
}
