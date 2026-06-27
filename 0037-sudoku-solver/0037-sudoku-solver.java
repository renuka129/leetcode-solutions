class Solution {
    public void solveSudoku(char[][] board) {
        f(board);
    }

    boolean f(char b[][]){
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                if(b[i][j]=='.'){
                    for(char k='1';k<='9';k++){
                        if(validsoduku(i,j,k,b)){
                            b[i][j]=k;
                            if(f(b)){
                                return true;
                            }
                            else{
                                b[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    boolean validsoduku(int row,int col,char c,char b[][]){
        int start=(row/3)*3;// for 3X3 matrix
        int end=(col/3)*3;
        for(int i=0;i<9;i++){
            if(b[row][i]==c){ //for row
                return false;
            }
            if(b[i][col]==c){ //for col
                return false;
            }
        }
        for(int i=start;i<start+3;i++){ //for 3X3 matrix
            for(int j=end;j<end+3;j++){
                if(b[i][j]==c){
                    return false;
                }
            }
        }
        return true;
    }
}