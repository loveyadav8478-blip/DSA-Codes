//package Graph;
//import java.util.*;
//class Pairr{
//    int r;
//    int c;
//    Pairr(int r, int c){
//        this.r = r;
//        this.c = c;
//    }
//}
//public class FloodFill {
//    private void bfs(int sr, int sc, int[][] image,int color, int[][] visited){
//        int m = image.length;
//        int n = image[0].length;
//        int ele = image[sr][sc];
//        image[sr][sc] = color;
//        Queue<Pairrr> q = new LinkedList<>();
//        q.add(new Pairrr(sr,sc));
//        visited[sr][sc] = 1;
//        while(!q.isEmpty()){
//            Pairrr p = q.poll();
//            int i = p.r;
//            int j = p.c;
//            if(i<m-1 && image[i+1][j]==ele && visited[i+1][j]==0){
//                q.add(new Pairrr(i+1,j));
//                visited[i+1][j] = 1;
//                image[i+1][j] = color;
//            }
//
//            if(i-1>=0 && image[i-1][j]==ele && visited[i-1][j]==0){
//                q.add(new Pairrr(i-1,j));
//                visited[i-1][j] = 1;
//                image[i-1][j] = color;
//            }
//
//            if(j<n-1 && image[i][j+1]==ele && visited[i][j+1]==0){
//                q.add(new Pairrr(i,j+1));
//                visited[i][j+1] = 1;
//                image[i][j+1] = color;
//            }
//
//            if(j-1>=0 && image[i][j-1]==ele && visited[i][j-1]==0){
//                q.add(new Pairrr(i,j-1));
//                visited[i][j-1] = 1;
//                image[i][j-1] = color;
//            }
//        }
//    }
//    private void dfs(int sr, int sc, int[][] image,int color, int[][] visited,int ele){
//        int m = image.length;
//        int n = image[0].length;
//        image[sr][sc] = color;
//        visited[sr][sc] = 1;
//        if(sr <m-1 && image[sr +1][sc]==ele && visited[sr +1][sc]==0){
//            visited[sr +1][sc] = 1;
//            image[sr +1][sc] = color;
//            dfs(sr +1, sc,image,color,visited,ele);
//        }
//
//        if(sr -1>=0 && image[sr -1][sc]==ele && visited[sr -1][sc]==0){
//            visited[sr -1][sc] = 1;
//            image[sr -1][sc] = color;
//            dfs(sr -1, sc,image,color,visited,ele);
//        }
//
//        if(sc <n-1 && image[sr][sc +1]==ele && visited[sr][sc +1]==0){
//            visited[sr][sc +1] = 1;
//            image[sr][sc +1] = color;
//            dfs(sr, sc +1,image,color,visited,ele);
//        }
//
//        if(sc -1>=0 && image[sr][sc -1]==ele && visited[sr][sc -1]==0){
//            visited[sr][sc -1] = 1;
//            image[sr][sc -1] = color;
//            dfs(sr, sc -1,image,color,visited,ele);
//        }
//
//    }
//    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//        int m = image.length;
//        int n = image[0].length;
//        int[][] visited = new int[m][n];
//        if(visited[sr][sc]==0){
//            dfs(sr,sc,image,color,visited,image[sr][sc]);
//        }
//        return image;
//    }
//}
