package Graph;

public class Leetcode684 {
    public int find(int i, int[] par){
        if(par[i]==i) return i;
        return par[i] = find(par[i],par);
    }
    public void union(int a, int b, int[] par, int[] size){
        a = find(a,par);
        b = find(b,par);
        if(a!=b){
            if(size[a]>size[b]){
                par[b] = a;
                size[a] += size[b];
            }
            else{
                par[a] = b;
                size[b] += size[a];
            }
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] par = new int[n+1];
        int[] size = new int[n+1];
        for(int i = 1; i<= n; i++){
            par[i] = i;
            size[i] = 1;
        }
        for(int i = 0; i< n; i++){
            int a = edges[i][0];
            int b = edges[i][1];
            if(find(a,par)==find(b,par)){
                return new int[]{a,b};
            }
            union(a,b,par,size);
        }
        return new int[]{0,0};
    }
}
