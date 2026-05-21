package Graph;

import java.util.*;

public class DistanceOfNearest1 {
    class Triple{
        int r;
        int c;
        int dist;
        Triple(int r, int c, int dist){
            this.r = r;
            this.c = c;
            this.dist = dist;
        }
    }
    public void bfs(Triple t,int[][] mat, int[][] nums){
        int m = mat.length;
        int n = mat[0].length;
        Queue<Triple> q = new LinkedList<>();
        q.add(t);
        nums[t.r][t.c] = 0;
        while(q.size()!=0){
            Triple temp = q.poll();
            int r = temp.r;
            int c = temp.c;
            int dist = temp.dist;
            if(c<n-1 && nums[r][c+1]>dist+1){
                nums[r][c+1] = dist+1;
                q.add(new Triple(r,c+1,dist+1));
            }
            if(c-1>=0 && nums[r][c-1]>dist+1){
                nums[r][c-1] = dist+1;
                q.add(new Triple(r,c-1,dist+1));
            }
            if(r-1>=0  && nums[r-1][c]>dist+1){
                nums[r-1][c] = dist+1;
                q.add(new Triple(r-1,c,dist+1));
            }
            if(r<m-1  && nums[r+1][c]>dist+1){
                nums[r+1][c] = dist+1;
                q.add(new Triple(r+1,c,dist+1));
            }
        }
    }
    public ArrayList<ArrayList<Integer>> nearest(int[][] mat) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        int[][] nums = new int[m][n];
        for(int i = 0; i< m; i++){
            Arrays.fill(nums[i],Integer.MAX_VALUE);
        }
        for(int i = 0; i< m; i++){
            for(int j = 0; j< n; j++){
                if(mat[i][j]==1){
                    bfs(new Triple(i,j,0),mat,nums);
                }
            }
        }
        for(int i = 0; i< m; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j< n; j++){
                temp.add(nums[i][j]);
            }
            ans.add(temp);
        }
        return ans;

    }
}
