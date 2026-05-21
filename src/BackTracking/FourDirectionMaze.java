package BackTracking;
public class FourDirectionMaze {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];
        show(0,0,rows-1,cols-1,"",isVisited);
    }

    private static void show(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]==true) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        show(sr,sc+1,er,ec,s+"R",isVisited);
        show(sr+1,sc,er,ec,s+"D",isVisited);
        show(sr,sc-1,er,ec,s+"L",isVisited);
        show(sr-1,sc,er,ec,s+"U",isVisited);
        isVisited[sr][sc] = false;
    }

}
