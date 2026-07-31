package Graph;
import java.util.*;
public class CourseSch4 {
    public List<Boolean> checkIfPrerequisite(int n, int[][] edges, int[][] qu) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] inDeg = new int[n];
        for(int i = 0; i< n; i++) adj.add(new ArrayList<>());
        for(var e : edges){
            adj.get(e[0]).add(e[1]);
            inDeg[e[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i< n; i++){
            if(inDeg[i]==0){
                q.add(i);
            }
        }
        Map<Integer,Set<Integer>> m = new HashMap<>();
        for(int i = 0; i<n; i++) m.put(i,new HashSet<>());

        while(!q.isEmpty()){
            int t = q.poll();
            for(var e : adj.get(t)){
                Set<Integer> st = m.get(e);
                st.add(t);
                st.addAll(m.get(t));
                m.put(e,st);
                inDeg[e]--;
                if(inDeg[e]==0){
                    q.add(e);
                }
            }
        }

        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i<qu.length; i++){
            ans.add(m.get(qu[i][1]).contains(qu[i][0]));
        }
        return ans;
    }
}
