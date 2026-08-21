class Solution {
    int[] valid ;
    public boolean isValidSudoku(char[][] board) {
        for(char[] row: board){
            if(!rowCheck(row))return false; 
        }
        if(!squareCheck(board))return false;
        return colCheck(board); 
    }
    boolean rowCheck(char[] row){
        valid = new int[9]; 
        for(int i= 0 ; i < 9 ;++i){
            if(row[i] != '.'){  
                int num = row[i] - '0'; 
                valid[num -1]++;
                if(valid[num -1] > 1 )return false;
            }
        }
        return true;
    }
    boolean colCheck(char[][] board){
        for(int i = 0 ; i< 9 ; ++i){
            valid = new int[9];
            for(int j = 0; j < 9; ++j){

                if(board[j][i] != '.'){
                    int num = board[j][i] - '0' ;
                    valid[num -1]++; 
                    if(valid[num -1  ]  > 1 )return false;
                }
            }
        }
        return true; 
    }
    boolean squareCheck(char[][] board){ 
        for(int i =0 ; i < 9; ++i){
            valid = new int[9];
            int rowOffSet = (i/3)*3;
            int colOffSet = (i%2)*3; 
            for(int row =0 ; row < 3 ; ++row){ 

                for(int col = 0 ; col < 3 ;++col){

                    if(board[row + rowOffSet][col + colOffSet] != '.'){
                        int num = board[row + rowOffSet][col + colOffSet ] - '0' ;
                        valid[num -1]++; 
                        if(valid[num -1  ]  > 1 )return false;
                    }
                }
            }
        }
       
     
        return true; 
    }
}
