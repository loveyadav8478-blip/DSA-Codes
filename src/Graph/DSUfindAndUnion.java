package Graph;

import java.util.Arrays;

public class DSUfindAndUnion {
//    Without Path Compression
    public static int find(int i,int[] parent){
        if(i==parent[i]) return i;
        return find(parent[i],parent);
    }
//    With Path Compression
    public static int find2(int i,int[] parent){
        if(i==parent[i]) return i;
        return parent[i] = find2(parent[i],parent);
    }
    public static void union(int x, int y, int[] parent, int[] rank){
        int xParent = find(x,parent);
        int yParent = find(y,parent);
        if(xParent==yParent) return;
        if(rank[xParent]>rank[yParent]){
            parent[yParent] = xParent;
        }
        else if(rank[xParent]<rank[yParent]){
            parent[xParent] = yParent;
        }
        else{
            parent[xParent] = yParent;
            rank[yParent]++;
        }
    }

//    Union by size
    static int[] size = new int[100];
    public static void union2(int x, int y, int[] parent){
        int xPar = find(x,parent);
        int yPar = find(y,parent);
        Arrays.fill(size,1);
        if(xPar != yPar){
            if(size[xPar]>size[yPar]){
                parent[yPar] = xPar;
                size[xPar] += size[yPar];
            }
            else{
                parent[xPar] = yPar;
                size[yPar] += size[xPar];
            }
        }
    }
}
