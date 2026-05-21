package BackTracking;
public class Nqueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }
        nqueen(board,0);
    }
    private static void display(char[][] board){
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void nqueen(char[][] board, int rows) {
        int n = board.length;
        if (rows == n) {
            display(board);
            return;
        }
        for(int j = 0; j < n; j++){
            if(isSafe(board,rows,j)){
                board[rows][j] = 'Q';
                nqueen(board,rows+1);
                board[rows][j] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int rows, int cols) {
        int n = board.length;
        //check column
        for(int j = 0; j < n; j++){
            if(board[j][cols]=='Q') return false;
        }
        //check rows
        for(int i = 0;i <n; i++){
            if(board[rows][i]=='Q') return false;
        }//check NE direction
        int i = rows;
        int j = cols;
        while(i>=0 && j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        //check SE dir
        i = rows;
        j = cols;
        while(i<n && j<n){
            if(board[i][j]=='Q') return false;
            i++;
            j++;
        }
        //check SW
        i = rows;
        j = cols;
        while(i<n && j>=0){
            if(board[i][j]=='Q') return false;
            i++;
            j--;
        }
        //check NW
        i = rows;
        j = cols;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q') return false;
            i--;
            j--;
        }
        return true;
    }
}
