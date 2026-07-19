package Graph;

import java.util.*;

class Triple{
    int i;
    int j;
    int m;
    Triple(int i, int j, int m){
        this.i = i;
        this.j = j;
        this.m = m;
    }
}
public class EvenMovesOfKnight {
    public boolean canReach(int[] start, int[] target) {
        Queue<Triple> q = new LinkedList<>();
        int[][] visited = new int[8][8];
        q.add(new Triple(start[0],start[1],0));
        visited[start[0]][start[1]] = 1;
        while(!q.isEmpty()){
            Triple t = q.poll();
            int x = t.i;
            int y = t.j;
            int mv = t.m;
            if(x==target[0] && y==target[1]){
                return mv%2==0;
            }
            if(visited[x][y]!=0){
                visited[x][y] = 1;
                if(x+2<8 && y+1<8){
                    q.add(new Triple(x+2,y+1,mv+1));
                    visited[x+2][y+1] = 1;
                }
                if(x-2>=0 && y-1>=0){
                    q.add(new Triple(x-2,y-1,mv+1));
                    visited[x-2][y-1] = 1;
                }
                if(x+1<8 && y+2<8){
                    q.add(new Triple(x+1,y+2,mv+1));
                    visited[x+1][y+2]  =1;
                }
                if(x-1>=0 && y-2>=0){
                    q.add(new Triple(x-1,y-2,mv+1));
                    visited[x-1][y-2] = 1;
                }
                if(x+2<8 && y-1>=0){
                    q.add(new Triple(x+2,y-1,mv+1));
                    visited[x+2][y-1] = 1;
                }
                if(x-2>=0 && y+1<8){
                    q.add(new Triple(x-2,y+1,mv+1));
                    visited[x-2][y+1] = 1;

                }
                if(x+1<8 && y-2>=0){
                    q.add(new Triple(x+1,y-2,mv+1));
                    visited[x+1][y-2] = 1;
                }
                if(x-1>=0 && y+2<8){
                    q.add(new Triple(x-1,y+2,mv+1));
                    visited[x-1][y+2]  =1;
                }
            }
        }
        return false;
    }
}
