class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int j=1;
        int max=1;
        int count=1;
        while(j<nums.length){
            if(((nums[j]-nums[j-1])==1)){
                count+=1;
                max=Math.max(count,max);
            }
            else if((nums[j]-nums[j-1])==0){
                j++;
                    continue;
                }
            else{
                count=1;
            }
            j++;
        }
        return max;
    }
}