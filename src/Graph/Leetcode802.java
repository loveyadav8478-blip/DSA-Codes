package Graph;
import java.util.*;
public class Leetcode802 {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<n ;i++){
            adj.add(new ArrayList<>());
        }
        int[] inDeg = new int[n];
        for(int i = 0; i<n;i++){
            for(int j : graph[i]){
                adj.get(j).add(i);
                inDeg[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i<n; i++){
            if(inDeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int p = q.poll();
            ans.add(p);
            for(var e : adj.get(p)){
                inDeg[e]--;
                if(inDeg[e]==0){
                    q.add(e);
                }
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
