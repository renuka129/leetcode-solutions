class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int []s=new int[2];
        s=max(weights);
        int l=s[0];
        int r=s[1];
        int ans=0;
        while(l<=r){
            int m=l+(r-l)/2;
            int needed=solve(m,weights);
            if(needed<=days){
                ans=m;
                r=m-1;
            }
            else if(needed>days){
                l=m+1;
            }
        }
        return ans;
    }
    int[] max(int []x){
        int max=0;
        int sum=0;
        for(int i=0;i<x.length;i++){
            max=Math.max(x[i],max);
            sum+=x[i];
        }
        return new int[]{max,sum};
    }
    int solve(int m, int w[]){
        int sum=0;
        int daysNeeded=1;
        for(int i=0;i<w.length;i++){
            if(sum+w[i]>m){
                sum=w[i];
                daysNeeded++;
            }
            else{
                sum+=w[i];
            }
        }
        return daysNeeded;
    }
}