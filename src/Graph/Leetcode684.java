package Graph;
import java.util.*;
public class Leetcode684 {
    class Pair{
        int a;
        int b;
        Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
    public int find(int i, int[] par){
        if(par[i]==i) return i;
        return par[i] = find(par[i],par);
    }
    public void union(int a, int b, int[] par, int[] size, boolean[] cycle){
        int x = find(a,par);
        int y = find(b,par);
        if(x==y) cycle[0] = true;
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
        }
        for(int i = 1; i<= n; i++){
            par[i] = i;
            size[i] = 1;
        }
        inDeg[0] = Integer.MAX_VALUE;
        int twoPar = 0;
        for(int i = 1; i<= n; i++){
            if(inDeg[i]==2){
                twoPar = i;
            }
        }
        boolean[] cycle = new boolean[1];
        int[] ans = new int[2];

        //2 Parent with and without cycle
        List<Pair> l = new ArrayList<>();
        for(int i = 0; i< n; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            if(twoPar==v){
                l.add(new Pair(u,v));
            }
        }
        if(l.size()!=0){
            Pair p = l.get(1);
            int u = p.a;
            int v = p.b;
            for(int i = 0; i< n; i++){
                int a = edges[i][0];
                int b = edges[i][1];
                if(a==u && v==b) continue;
                union(a,b,par,size,cycle);
            }
            if(cycle[0]){
                Pair c = l.get(0);
                ans[0] = c.a; ans[1] = c.b;
            }
            else{
                ans[0] = u; ans[1] = v;
            }
        }
        else{


            // 1 parent with and without cycle
            for(int i = 0; i< n; i++){
                int a = edges[i][0];
                int b = edges[i][1];
                if(find(a,par)==find(b,par)){
                    ans[0] = a;
                    ans[1] = b;
                }
                union(a,b,par,size,cycle);
            }
        }
        return ans;
    }
}
