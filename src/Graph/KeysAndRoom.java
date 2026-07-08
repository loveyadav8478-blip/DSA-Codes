package Graph;
import java.util.*;
public class KeysAndRoom {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a);
        a.clear();
        a.add(2);
        l.add(a);
        a.clear();
        a.add(3);
        l.add(a);
        a.clear();
        l.add(new ArrayList<>(1));

        System.out.println(canVisitAllRooms(l));
    }
    public static void bfs(int i, List<List<Integer>> adj, int[] visited){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = 1;
        while(q.size()!=0){
            int e = q.poll();
            for(int j : adj.get(e)){
                if(visited[j]==0){
                    visited[j] = 1;
                    q.add(j);
                }
            }
        }
    }
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        int[] visited = new int[n];
        bfs(0,rooms,visited);
        for(int e : visited){
            if(e==0) return false;
        }
        return true;
    }
}
