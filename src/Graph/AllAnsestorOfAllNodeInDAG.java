package Graph;

import java.util.*;

public class AllAnsestorOfAllNodeInDAG {
    public static void main(String[] args) {
        System.out.println(getAncestors(8,new int[][]{{0,3},{0,4},{1,3},{2,4},{2,7},{3,5},{3,6},{3,7},{4,6}}));
        Set<Integer> l = new TreeSet<>();
        l.add(4);
        l.add(7);
        l.add(5);
        System.out.println(l);
    }
    public static Set<Integer> dfs(int node, List<List<Integer>> adj, List<Set<Integer>> dp){
        Set<Integer> a = new TreeSet<>();
        if(dp.get(node)!=null){
            return dp.get(node);
        }
        for(int e : adj.get(node)){
            a.add(e);
            a.addAll(dfs(e,adj,dp));
        }
        dp.set(node,a);
        return a;
    }
    public static List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        List<Set<Integer>> dp = new ArrayList<>();
        for(int i = 0; i< n; i++) dp.add(null);
        for(int i = 0; i< n; i++) adj.add(new ArrayList<>());
        for(int i = 0; i<edges.length; i++){
            int u = edges[i][1];
            int v = edges[i][0];
            adj.get(u).add(v);
        }
        for(int i = 0; i< adj.size(); i++){
            ans.add(new ArrayList<>(dfs(i,adj,dp)));
        }
        return ans;
    }
}
