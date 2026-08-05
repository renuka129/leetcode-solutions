class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>>l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        for(int e[]:invocations){
            int u=e[0];
            int v=e[1];
            l.get(u).add(v);
        }
        List<Integer>res=new ArrayList<>();
        boolean vis[]=new boolean[n];
        bfs(l,res,vis,n,k);
        return res;
    }
    void bfs(List<List<Integer>>l,List<Integer>res,boolean vis[],int n,int k){
        Queue<Integer>q=new LinkedList<>();
        q.add(k);
        vis[k]=true;
        while(!q.isEmpty()){
            int s=q.poll();
            for(int i:l.get(s)){
                if(!vis[i]){
                vis[i]=true;
                q.add(i);
                }
            }
        }
        boolean f=true;
        for(int i=0;i<n;i++){
            for(int j:l.get(i)){
                if(!vis[i]&&vis[j]){
                f=false;
                }
            }
        }
        if(!f){
            for(int i=0;i<n;i++){
                res.add(i);
            }
        }
        else{
            for(int i=0;i<n;i++){
                if(!vis[i]){
                    res.add(i);
                }
            }
        }
        
    }
}
