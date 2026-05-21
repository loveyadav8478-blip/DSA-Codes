package Graph;

import java.util.*;

public class CycleDetectionInDG {
    public boolean isCyclic(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] inDeg = new int[n];
        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i < n; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            inDeg[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i< n ; i++){
            if(inDeg[i]==0){
                q.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(q.size()!=0){
            int p = q.poll();
            ans.add(p);
            for(int e : adj.get(p)){
                inDeg[e]--;
                if(inDeg[e]==0) q.add(e);
            }
        }
        return (ans.size())!=n;
    }
}
