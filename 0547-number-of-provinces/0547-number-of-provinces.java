class Solution {
    public int findCircleNum(int[][] isConnected) {
        List<List<Integer>>l=new ArrayList<>();
        int n=isConnected.length;
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    l.get(i).add(j);
                }
            }
        }
        int count=0;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                count++;
                dfs(i,l,vis);
            }
        }
        return count;
    }
    void dfs(int node,List<List<Integer>>l,boolean vis[]){
        vis[node]=true;
        for(int i:l.get(node)){
            if(!vis[i]){
                dfs(i,l,vis);
            }
        }
    }
}