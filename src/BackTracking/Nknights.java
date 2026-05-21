package BackTracking;
public class Nknights {
    static int maxKnights = -1;
    static int number = 8;
    public static boolean isSafe(char[][] board, int r, int c){
        int n = board.length;
        int i;
        int j;
        //2 Up 1 right
        i = r-2;
        j = c+1;
        if(i>=0 && j<n && board[i][j]=='k') return false;
        //2 Up 1 left
        i = r-2;
        j = c-1;
        if(i>=0 && j>=0 && board[i][j]=='k') return false;
        //2 dn 1 right
        i = r+2;
        j = c+1;
        if(i<n && j<n && board[i][j]=='k') return false;
        //2 dn 1 left
        i = r+2;
        j = c-1;
        if(i<n && j>=0 && board[i][j]=='k') return false;
        //2 rt 1 up
        i = r-1;
        j = c+2;
        if(i>=0 && j<n && board[i][j]=='k') return false;
        //2 rt 1 dn
        i = r+1;
        j = c+2;
        if(i<n && j<n && board[i][j]=='k') return false;
        //2 left 1 up
        i = r-1;
        j = c-2;
        if(i>=0 && j>=0 && board[i][j]=='k') return false;
        //2 lft 1 dn
        i = r+1;
        j = c-2;
        if(i<n && j>=0 && board[i][j]=='k') return false;
        return true;
    }
    public static void nKnights(char[][] board, int r, int c,int num){
        int n = board.length;
        if(r==n){
            if(num==number){
                for (int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++){
                        System.out.print(board[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            maxKnights = Math.max(maxKnights,num);
            return;
        }
        else if(isSafe(board,r,c)){
            board[r][c] = 'k';
            if(c!=n-1) nKnights(board,r,c+1,num+1);
            else nKnights(board,r+1,0,num+1);
            board[r][c] = 'x'; //backtracking
        }
        if(c!=n-1) nKnights(board,r,c+1,num);
        else nKnights(board,r+1,0,num);
    }
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                board[i][j] = 'x';
            }
        }
        nKnights(board,0,0,0);
        System.out.println();
        System.out.println(maxKnights);
    }
}
