package Graph;

import java.util.*;

class Triplet2 {
    int node;
    int dist;
    int par;
    Triplet2(int node, int par, int dist){
        this.node = node;
        this.par = par;
        this.dist = dist;
    }
}

class Triplet1 implements Comparable<Triplet1> {
    int u;
    int v;
    int w;
    Triplet1(int u, int v, int w){
        this.u = u;
        this.v = v;
        this.w = w;
    }

    @Override
    public int compareTo(Triplet1 o) {
        return this.w- o.w;
    }
}
public class Leetcode1584 {
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
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<Triplet1> edj = new ArrayList<>();
        for(int i = 0; i< n; i++){
            for(int j = i+1; j< n; j++){
                int mD = Math.abs(points[i][0]-points[j][0]) + Math.abs(points[i][1]+points[j][1]);
                Triplet1 t = new Triplet1(i,j,mD);
                edj.add(t);
            }
        }
        int[] par = new int[n];
        int[] size = new int[n];
        for(int i = 0; i< n; i++){
            par[i] = i;
            size[i] = 1;
        }
        int ans = 0;
        for(int i = 0;i < edj.size(); i++){
            Triplet1 t = edj.get(i);
            int a = t.u;
            int b = t.v;
            int w = t.w;
            if(find(a,par) != find(b,par)){
                ans += w;
                union(a,b,par,size);
            }
        }
        return ans;

    }






















    public int minCostConnectPoints1(int[][] points) {
        int n = points.length;
        int[] visited = new int[n];
        int ans = 0;

        PriorityQueue<Triplet2> pq = new PriorityQueue<>(new Comparator<Triplet2>() {
            @Override
            public int compare(Triplet2 o1, Triplet2 o2) {
                return (o1.dist==o2.dist) ? o1.node-o2.node : o1.dist-o2.dist;
            }
        });

        pq.add(new Triplet2(0,-1,0));

        while(!pq.isEmpty()){
            Triplet2 p = pq.poll();
            int node = p.node, dist = p.dist, par = p.par;
            if(visited[node]==1) continue;
            visited[node] = 1;
            ans += dist;
            for(int i = 0; i< n; i++){
                if(i==node) continue;
                if(i==par) continue;
                if(visited[i]==1) continue;
                int x1 = points[node][0];
                int y1 = points[node][1];
                int x2 = points[i][0];
                int y2 = points[i][1];
                int mD = Math.abs(x1-x2) + Math.abs(y1-y2);
                pq.add(new Triplet2(i,node,mD));
            }

        }

        return ans;
    }
}
