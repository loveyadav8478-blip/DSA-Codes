//class Solution {
//    static int check = 0;
//    public boolean isValid(char[][] board, int r, int c, char num){
//        for(int j = 0; j<9; j++){
//            if(board[r][j]==num) return false;
//        }
//        for(int i = 0; i<9; i++){
//            if(board[i][c]==num) return false;
//        }
//        int row = r/3*3;
//        int col = c/3*3;
//        for(int i = row; i <row+3; i++){
//            for(int j = col; j <col+3; j++){
//                if(board[i][j]==num) return false;
//            }
//        }
//        return true;
//    }
//    public void solve(char[][] board, int r, int c){
//        if(r==9){
//            check=1;
//            return;
//        }
//        else if(board[r][c]!='.'){
//            if(c!=8) solve(board,r,c+1);
//            else solve(board,r+1,0);
//        }
//        else{//board[r][c]=='.'
//            for(char i ='1';i <='9'; i++){
//                if(isValid(board,r,c,i)){
//                    board[r][c] = i;
//                    if(c!=8) solve(board,r,c+1);
//                    else solve(board,r+1,0);
//                    if(check==1) return;
//                    board[r][c] = '.';//backtracking
//                }
//            }
//        }
//    }
//    public void solveSudoku(char[][] board) {
//        solve(board,0,0);
//        check = 0;
//    }
//}