class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return f(nums,k)-f(nums,k-1);
        
    }
    int f(int nums[],int k){
        Map<Integer,Integer>m=new HashMap<>();
        int i=0;int j=0;
        int count=0;
        while(j<nums.length){
            m.put(nums[j],m.getOrDefault(nums[j],0)+1);
            while(m.size()>k){
                m.put(nums[i],m.get(nums[i])-1);
                if(m.get(nums[i])==0){
                    m.remove(nums[i]);
                }
                i++;
            }
            count+=j-i+1;
            j++;
        }
        return count;
    }
}