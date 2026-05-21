package Graph;

import java.util.*;
public class CourseSchedulerII {
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
        List<Integer> temp = new ArrayList<>();
        while(q.size()!=0){
            int e = q.poll();
            temp.add(e);
            ans[k++] = e;
            for(int l : adj.get(e)){
                inDeg[l]++;
                if(inDeg[l]==0){
                    q.add(l);
                }
            }
        }
        return (temp.size()==numCourses) ? ans : new int[0];
    }
}
