class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>>res=new ArrayList<>();
        f(n,board,res,0);
        return res;
        
    }
    void f(int n,char[][]board,List<List<String>>res,int col){
        if(col==n){
            List<String>l=new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(new String(board[i]));
            }
            res.add(new ArrayList<>(l));
            return;
        }
        for(int row=0;row<n;row++){
            if(issafe(row,col,board,n)){
                board[row][col]='Q';
                f(n,board,res,col+1);
                board[row][col]='.';
            }
        }
    }
    boolean issafe(int row,int col,char board[][], int n){
        int drow=row;
        int dcol=col;
        while(row>=0&&col>=0){ //upper left diagonal
            if(board[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        col=dcol;
        row=drow;
        while(col>=0){ //left
            if(board[row][col]=='Q'){
                return false;
            }
            col--;
        }
        col=dcol;
        row=drow;
        while(row<n&&col>=0){ //lower left diagonal
            if(board[row][col]=='Q'){
                return false;
            }
            row++;
            col--;
        }
        return true;
    }

}