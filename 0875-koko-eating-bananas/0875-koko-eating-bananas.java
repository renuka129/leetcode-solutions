class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;int r=max(piles);
        int ans=0;
        while(l<=r){
            int m=l+(r-l)/2;
            long hours=solve(m,piles);
            if(hours<=h){
                ans=m;
                r=m-1;
            }
           else if(hours>h){
                l=m+1;
            }
        }

        return ans;
    }
    int max(int a[]){
        int max=0;
        for(int i=0;i<a.length;i++){
            max=Math.max(a[i],max);
        }
        return max;
    }

    long solve(int m,int a[]){
        long sum=0;
        for(int i=0;i<a.length;i++){
            sum+=(long)(a[i]+m-1)/m;
        }
        return sum;
    }

}