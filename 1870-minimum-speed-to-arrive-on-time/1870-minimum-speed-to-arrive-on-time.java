class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int l=1;
        int r=10_000_000;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            double time=solve(m,dist);
            if(time<=hour){
                ans=m;
                r=m-1;
            }
            else if(time>hour){
                l=m+1;
            }
        }
        return ans;
        
    }
    int max(int []d){
        int max=0;
        for(int i=0;i<d.length;i++){
            max=Math.max(d[i],max);
        }
        return max;
    }
    double solve(int m,int []d){
        double sum=0;
        for(int i=0;i<d.length;i++){
            if(i<d.length-1){
                sum+=(d[i]+m-1)/m;
            }
            else{
            sum+=(double)((d[i]*1.0)/m);
            }
        } 
        return sum;
    }
}