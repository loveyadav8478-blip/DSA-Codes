package Graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class NumberOfPrivinces {
    public void bfs(int node, int[][] isConnected, int[] visited) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(node);
        visited[node] = 1;
        while(q.size()!=0){
            int e = q.remove();
            for(int j = 0; j< isConnected.length; j++){
                if(isConnected[e][j]==0 && visited[j]==0){
                    visited[j] = 1;
                    q.add(j);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int V = isConnected.length;
        int[] visited = new int[V];
        for(int i = 0; i< isConnected.length; i++){
            if(visited[i]==0){
                visited[i] = 1;
                bfs(i,isConnected,visited);
                count++;
            }
        }
        return count;
    }
}
