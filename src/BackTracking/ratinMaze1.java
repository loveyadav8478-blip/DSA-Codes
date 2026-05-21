package BackTracking;
public class ratinMaze1 {
    public static void main(String[] args) {
        int count = maze(1,1,2,3);
        System.out.println(count);
    }
    public static int maze(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc==ec) return 1;
        int r = maze(sr,sc+1,er,ec);
        int d = maze(sr+1,sc,er,ec);
        return r+d;
    }
}
