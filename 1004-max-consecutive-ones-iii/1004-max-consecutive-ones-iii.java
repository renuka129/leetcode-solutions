class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int max=0;
        int count0=0;
        while(j<nums.length){
            if(nums[j]==0){
                count0++;
            }
            if(count0>k){
                if(nums[i]==0){
                    count0--;
                }
                i++;
            }
            max=Math.max(j-i+1,max);
            j++;
        }
        return Math.max(max,j-i);
    }
}