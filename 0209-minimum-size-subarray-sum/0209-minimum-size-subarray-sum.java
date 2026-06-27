class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int j=0;
        int min=Integer.MAX_VALUE;
        int curr=0;
        while(j<nums.length){
            curr+=nums[j];
            while(curr>=target){
                min=Math.min(min,j-i+1);
                curr-=nums[i];
                i++;
            }
            
                j++;
            
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}