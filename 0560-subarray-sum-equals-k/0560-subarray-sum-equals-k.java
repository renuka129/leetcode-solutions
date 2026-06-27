class Solution {
    public int subarraySum(int[] nums, int k) {
        // if(nums.length==1){
        // if(nums[0]==k){
        //     return 1;
        // }
        // if(nums[0]!=k){
        //     return 0;
        // }
        // }
        Map<Integer,Integer>m=new HashMap<>();
        m.put(0,1);
        int curr=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            curr+=nums[i];
           if(m.containsKey(curr-k)){
           count+=m.get(curr-k);
           }
           m.put(curr,m.getOrDefault(curr,0)+1);
        } 
        return count;       
    }
}