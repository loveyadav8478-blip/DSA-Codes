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
    public int findCircleNum1(int[][] isConnected) {
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

//    By DSU
    public int find(int a, int[] par){
        if(par[a] == a) return a;
        return par[a] = find(par[a],par);
    }
    public void union(int x, int y, int[] par, int[] size){
        x = find(x,par);
        y = find(y,par);
        if(x!=y){
            if(size[x]>size[y]){
                par[y] = x;
                size[x] += size[y];
            }
            else{
                par[x] = y;
                size[y] += size[x];
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] par = new int[n+1];
        int[] size = new int[n+1];
        for(int i=1;i<=n;i++){
            par[i] = i;
            size[i] = 1;
        }
        for(int i = 0; i< n; i++){
            for(int j = 0; j< n; j++){
                if(i!=j && isConnected[i+1][j+1]==1){
                    union(i+1,j+1,par,size);
                }
            }
        }
        int count = 0;
        for(int i = 1; i<= n; i++){
            if(i==par[i]) count++;
        }
        return count;
    }
}
