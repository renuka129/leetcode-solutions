class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=f(0,nums.length-1,nums);
        if(n>=0){
            return true;
        }
        return false;
        
    }
    int f(int l,int r,int[] nums){
        if(l==r){
            return nums[l];
        }
        int left=nums[l]-f(l+1,r,nums);
        int right=nums[r]-f(l,r-1,nums);
        return Math.max(left,right);
    }
}