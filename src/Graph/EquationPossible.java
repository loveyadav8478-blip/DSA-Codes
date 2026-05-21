package Graph;

public class EquationPossible {
    public int find(int i, int[] parent){
        if(i==parent[i]) return i;
        return parent[i] = find(parent[i],parent);
    }
    public void union(int x, int y, int[] parent, int[] rank){
        int xFind = find(x,parent);
        int yFind = find(y,parent);
        if(xFind==yFind) return;
        if(rank[xFind]>rank[yFind]){
            parent[yFind] = xFind;
        }
        else if(rank[xFind]<rank[yFind]){
            parent[xFind] = yFind;
        }
        else{
            parent[yFind] = xFind;
            rank[xFind]++;
        }
    }
    public boolean equationsPossible(String[] equations) {
        int[] parent = new int[26];
        int[] rank = new int[26];
        for(int i = 0; i< 26; i++){
            parent[i] = i;
        }

        for(int i = 0; i< equations.length; i++){
            String str = equations[i];
            if(str.charAt(1)=='='){
                union(str.charAt(0)-'a',str.charAt(3)-'a',parent,rank);
            }
        }

        for(int i = 0; i< equations.length; i++){
            String str = equations[i];
            if(str.charAt(1)=='!'){
                int fstFind = find(str.charAt(0)-'a',parent);
                int lstFind = find(str.charAt(3)-'a',parent);
                if(fstFind==lstFind) return false;
            }
        }
        return true;
    }
}
