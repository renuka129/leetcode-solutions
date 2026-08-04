class Solution {
    public int maximumPopulation(int[][] logs) {
        Map<Integer,Integer>m=new HashMap<>();
        int res[]=new int[101];
        for(int i=0;i<logs.length;i++){
            int b=logs[i][0];
            int d=logs[i][1];
            res[b-1950]+=1;
            res[d-1950]-=1;
        }
        for(int i=1;i<res.length;i++){
            int c=res[i-1];
            res[i]=c+res[i];
        }
        int max=0;
        int ans=0;
        for(int i=0;i<res.length;i++){
            if(max<res[i]){
                max=res[i];
                ans=1950+i;
            }
        }
        return ans;
    }
}