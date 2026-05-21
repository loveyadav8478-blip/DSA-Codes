package BackTracking;
public class PrintPath {
    public static void main(String[] args) {
        show(1,1,3,3,"");
    }
    private static void show(int sr, int sc, int er, int ec, String s) {
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        show(sr,sc+1,ec,er,s+"R");
        show(sr+1,sc,ec,er,s+"D");
    }

}
