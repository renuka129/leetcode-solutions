class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int max=0;
        for(int i[]:trips){
            max=Math.max(max,i[2]);
        }
        int res[]=new int[max+1];
        for(int i=0;i<trips.length;i++){
            int f=trips[i][1];
            int t=trips[i][2];
            int d=trips[i][0];
            res[f]+=d;
            if(t<res.length){
                res[t]-=d;
            }
        }
        for(int i=1;i<res.length;i++){
            int c=res[i-1];
            res[i]=c+res[i];
        }
        for(int i=0;i<res.length;i++){
            if(res[i]>capacity){
                return false;
            }
        }
        return true;
    }
}