package Graph;

public class DSUfindAndUnion {
    public static int find(int i,int[] parent){
        if(i==parent[i]){
            return i;
        }
        return find(parent[i],parent);
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
}
