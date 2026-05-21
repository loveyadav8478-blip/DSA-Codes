//class Solution {
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
//    public boolean isValidSudoku(char[][] board) {
//        for(int i = 0; i <9; i++){
//            for(int j = 0; j<9 ;j++){
//                if(board[i][j] == '.') continue;
//                char num = board[i][j];
//                board[i][j] = '.';
//                if(!isValid(board,i,j,num)) return false;
//                board[i][j] = num;
//            }
//        }
//        return true;
//    }
//}