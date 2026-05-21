package Graph;

import java.util.*;

public class CourseScheduler {
    boolean bool;
    public boolean canFinish(int n, int[][] edg) {
        bool = true;
        List<List<Integer>> adj = new ArrayList<>();
        int[] inDeg = new int[n];
        for(int i = 0;i < n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i< edg.length; i++){
            int u = edg[i][0];
            int v = edg[i][1];
            adj.get(u).add(v);
        }
        int[] visited = new int[n];
        int[] pos = new int[n];
        for(int i = 0; i< n; i++){
            if(visited[i]==0) dfs(i,adj,visited,pos);
        }
        return bool;
    }
    public void dfs(int i, List<List<Integer>> adj, int[] visited, int[] pos){
        visited[i] = 1;
        pos[i] = 1;
        for(var e : adj.get(i)){
            if(visited[e]==0){
                dfs(e,adj,visited,pos);
            }
            if(pos[e]==1) {
                bool = false;
                return;
            }
        }
        pos[i] = 0;
    }
    public int[] findOrder(int numCourses, int[][] nums) {
        int[] ans = new int[numCourses];
        int n = nums.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }
        int[] inDeg = new int[numCourses];
        for(int i = 0; i<n ;i++){
            int u = nums[i][1];
            int v = nums[i][0];
            adj.get(u).add(v);
            inDeg[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i< numCourses; i++){
            if(inDeg[i]==0) q.add(i);
        }
        int k = 0;
        while(q.size()!=0){
            int e = q.poll();
            ans[k++] = e;
            for(int l : adj.get(e)){
                inDeg[l]--;
                if(inDeg[l]==0){
                    q.add(l);
                }
            }
        }
        return (k==numCourses) ? ans : new int[0];
    }
}
