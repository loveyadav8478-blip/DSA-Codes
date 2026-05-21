package Graph;
import java.util.*;
public class TopologicalSort {
//    public ArrayList<Integer> topoSort(int n, int[][] edges) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        List<List<Integer>> adj = new ArrayList<>();
//        int[] inDeg = new int[n];
//        for(int i = 0; i< n; i++){
//            adj.add(new ArrayList<>());
//        }
//        for(int i = 0; i< edges.length; i++){
//            int u = edges[i][0];
//            int v = edges[i][1];
//            adj.get(u).add(v);
//            inDeg[v]++;
//        }
//        Queue<Integer> q = new LinkedList<>();
//        for(int i = 0; i<n; i++){
//            if(inDeg[i]==0){
//                q.add(i);
//            }
//        }
//        while(q.size()!=0){
//            int p = q.poll();
//            ans.add(p);
//            for(int e : adj.get(p)){
//                    inDeg[e]--;
//                    if(inDeg[e]==0){
//                        q.add(e);
//                    }
//            }
//        }
//        return ans;
//    }


    public ArrayList<Integer> topoSort(int n, int[][] edges) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] visited = new int[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<n ;i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0;i < n; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }
        for(int i =0; i< n;i++){
            if(visited[i]==0){
                dfs(i,visited,adj,ans);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    private void dfs(int i, int[] visited, List<List<Integer>> adj,ArrayList<Integer> ans) {
        visited[i] = 1;
        for(var e : adj.get(i)){
            if(visited[e]==0){
                visited[e] = 1;
                dfs(e,visited,adj,ans);
            }
        }
        ans.add(i);
    }
}
