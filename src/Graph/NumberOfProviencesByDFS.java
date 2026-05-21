package Graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class NumberOfProviencesByDFS {
    public void dfs(int node, int[][] isConnected, int[] visited) {
        visited[node] = 1;
        for(int j = 0; j< isConnected.length; j++){
            if(isConnected[node][j]==1 && visited[j]==0){
                dfs(j,isConnected,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int V = isConnected.length;
        int[] visited = new int[V];
        for(int i = 0; i< isConnected.length; i++){
            if(visited[i]==0){
                dfs(i,isConnected,visited);
                count++;
            }
        }
        return count;
    }
}
