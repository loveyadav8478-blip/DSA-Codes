package Graph;
import java.util.*;
public class DetonationgTheBomb {
    public static void main(String[] args) {
        System.out.println(maximumDetonation(new int[][]{{1,1,5},{10,10,5}}));
    }
    public static int bfs(int node, List<List<Integer>> adj){
        int[] visited = new int[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = 1;
        while(!q.isEmpty()){
            int e = q.poll();
            for(int ele : adj.get(e)){
                if(visited[ele]==0){
                    q.add(ele);
                    visited[ele] = 1;
                }
            }
        }
        int count = 0;
        for(int e : visited) if(e==1) count++;
        return count;
    }
    public static int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                long dx = Math.abs(bombs[i][0]-bombs[j][0]);
                long dy = Math.abs(bombs[i][1]-bombs[j][1]);
                int radi = bombs[i][2];
                if((dx*dx)+(dy*dy)<= (long) radi * radi){
//                    if(i==j) continue;
                    adj.get(i).add(j);
                }
            }
        }
        int max = -1;
        for(int i = 0; i< n; i++){
                max = Math.max(max,bfs(i,adj));
        }
        return max;
    }
}
