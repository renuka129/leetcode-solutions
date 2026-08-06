class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original=image[sr][sc];
        int n=image.length;
        int m=image[0].length;
        if(image[sr][sc]==color){
            return image;
        }
        Queue<Pair>q=new LinkedList<>();
        boolean vis[][]=new boolean[n][m];
        q.add(new Pair(sr,sc));
        image[sr][sc]=color;
        vis[sr][sc]=true;
        int dx[]={-1,0,1,0};
        int dy[]={0,1,0,-1};
        while(!q.isEmpty()){
            Pair p=q.poll();
            int x=p.row;
            int y=p.col;
            for(int i=0;i<4;i++){
                int nr=x+dx[i];
                int nc=y+dy[i];
                if(nr>=0&&nc>=0&&nr<n&&nc<m&&!vis[nr][nc]&&original==image[nr][nc]){
                    image[nr][nc]=color;
                    vis[nr][nc]=true;
                    q.add(new Pair(nr,nc));
                }
            }
        }
        return image;
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