class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'&&!vis[i][j]){
                    count++;
                    bfs(grid,vis,i,j);
                }
            }
        }
        return count;
    }
    void bfs(char[][] grid,boolean vis[][],int row,int col){
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(row,col));
        vis[row][col]=true;
        while(!q.isEmpty()){
            Pair p=q.poll();
            int r=p.row;
            int c=p.col;
            int dx[]={-1,0,1,0};
            int dy[]={0,1,0,-1};
            for(int i=0;i<4;i++){
                int nr=r+dx[i];
                int nc=c+dy[i];
                if(nr>=0&&nr<grid.length&&nc>=0&&nc<grid[0].length&&grid[nr][nc]=='1'&&!vis[nr][nc]){
                    vis[nr][nc]=true;
                    q.add(new Pair(nr,nc));
                }
            }
        }
    }
}
class Pair{
    int row;
    int col;
    Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}