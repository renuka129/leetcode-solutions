class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair>q=new LinkedList<>();
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2&&!vis[i][j]){
                    vis[i][j]=true;
                    q.add(new Pair(i,j));
                }
            }
        }
        int count=bfs(n,m,grid,vis,q);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return count;
    }
    int bfs(int n,int m,int[][]grid,boolean vis[][],Queue<Pair>q){
        int dx[]={-1,0,1,0};
        int dy[]={0,1,0,-1};
        int count=0;
        while(!q.isEmpty()){
            int size=q.size();
           boolean isrotten=false;
            for(int j=0;j<size;j++){
            Pair p=q.poll();
            int row=p.r;
            int col=p.c;
            for(int i=0;i<4;i++){
                int nr=dx[i]+row;
                int nc=dy[i]+col;
                if(nr>=0&&nc>=0&&nr<n&&nc<m&&grid[nr][nc]==1&&!vis[nr][nc]){
                    vis[nr][nc]=true;
                    isrotten=true;
                    grid[nr][nc]=2;
                    q.add(new Pair(nr,nc));
                }
            }
            }
            if(isrotten){
            count++;}
        }
        return count;
    }
}
class Pair{
    int r;
    int c;
    Pair(int r,int c){
        this.r=r;
        this.c=c;
    }
}
