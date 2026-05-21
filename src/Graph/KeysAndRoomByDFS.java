package Graph;
import java.util.*;
public class KeysAndRoomByDFS {
    public void bfs(int i, List<List<Integer>> adj, int[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = 1;
        while(q.size()!=0){
            int e = q.poll();
            for(var v : adj.get(e)){
                if(visited[v]==0){
                    visited[v] = 1;
                    q.add(v);
                }
            }
        }
    }
    public void dfs(int i, List<List<Integer>> adj, int[] visited){
        visited[i] = 1;
        for(var v : adj.get(i)){
            if(visited[v]==0){
                visited[v] = 1;
                dfs(v,adj,visited);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int[] visited = new int[adj.size()];
        visited[0] = 1;
        dfs(0,adj,visited);

        for(int i : visited){
            if(i==0) return false;
        }
        return true;
    }
}
