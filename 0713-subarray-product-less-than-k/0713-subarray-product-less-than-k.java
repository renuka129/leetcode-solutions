class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0;
        int j=0;
        int count=0;
        int mul=1;
        if(k<=1){
            return 0;
        }
        while(j<nums.length){
            mul*=nums[j];
            while(mul>=k&&i<nums.length){
                mul/=nums[i];
                i++;
            }
            count+=j-i+1;
            j++;
        }
        if(count<0){
            return 0;
        }
        return count;
    }
}