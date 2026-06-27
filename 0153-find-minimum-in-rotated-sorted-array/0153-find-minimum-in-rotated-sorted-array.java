class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]>=nums[l]){
                min=Math.min(nums[l],min);
                l=mid+1;
            }
            else{
                min=Math.min(nums[mid],min);
                r=mid-1;
            }
        }
        return min;
    }
}