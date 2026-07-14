package Graph;

import java.util.*;

public class CycleDetectionInDG {
    public static void main(String[] args) {
        System.out.println(isCyclic(4,new int[][]{{0, 1}, {0, 2}, {1, 2}, {2, 3}}));
    }
    public static boolean isCyclic(int n, int[][] edges) {
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
        while(!q.isEmpty()){
            int p = q.poll();
            ans.add(p);
            for(int e : adj.get(p)){
                inDeg[e]--;
                if(inDeg[e]==0) q.add(e);
            }
        }
        System.out.println(ans);
        return (ans.size())!=n;
    }
}
