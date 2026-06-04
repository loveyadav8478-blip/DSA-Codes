package Graph;

public class RedundantConnection2 {
    public int find(int i, int[] par){
        if(par[i]==i) return i;
        return par[i] = find(par[i],par);
    }
    public void union(int a, int b, int[] par, int[] size, boolean cycle){
        int x = find(a,par);
        int y = find(b,par);
        if(find(a,par)==find(b,par)) cycle = true;
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
    public int[] findRedundantDirectedConnection(int[][] edges) {
        int n = edges.length;
        int[] inDeg = new int[n+1];
        int[] par = new int[n+1];
        int[] size = new int[n+1];
        for(int i = 0; i< n; i++){
            inDeg[edges[i][1]]++;
            par[i] = i;
            size[i] = 1;
        }
        inDeg[0] = Integer.MAX_VALUE;
        int twoPar = 0;
        for(int i = 0; i< n; i++){
            if(inDeg[i]==2){
                twoPar = i;
            }
        }
        boolean cycle = false;
        int[] ans = new int[2];
        for(int i = 0; i< n; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            if(twoPar==v){
                ans[0] = u;
                ans[1] = v;
                for(int j = 0;j <n; j++){
                    int a = edges[j][0];
                    int b = edges[j][1];
                    if(a==u && v==b) continue;
                    union(a,b,par,size,cycle);
                    if(cycle){//Cycle Found
                        return new int[]{a,b};
                    }
                    else{
                        return ans;
                    }
                }
            }
            else{
                union(u,v,par,size,cycle);
                if(cycle){
                    return new int[]{u,v};
                }
            }
        }
        return ans;
    }
}
