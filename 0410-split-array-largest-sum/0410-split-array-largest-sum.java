class Solution {
    public int splitArray(int[] nums, int k) {
        int a[]=new int[2];
        a=max(nums);
        int l=a[0];
        int r=a[1];
        int ans=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            int subarrays=solve(mid,nums);
            if(subarrays<=k){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
    int[] max(int nums[]){
        int sum=0;int max=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,nums[i]);
        }
        return new int[]{max,sum};
    }
    int solve(int m,int nums[]){
        int sum=0;int subarrays=1;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=m){
                sum+=nums[i];
            }
            else{
                sum=nums[i];
                subarrays++;
            }
        }
        return subarrays;
    }
}