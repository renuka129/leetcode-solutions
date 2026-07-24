class Solution {
    public int uniqueXorTriplets(int[] nums) {
        // Set<Integer>s=new HashSet<>();
        // Set<Integer>pair=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i;j<nums.length;j++){
        //         pair.add(nums[i]^nums[j]);
        //     }
        // }
        // for(int i:pair){
        //     for(int j=0;j<nums.length;j++){
        //         s.add(nums[j]^i);
        //     }
        // }
        // return s.size();
        //optimized version
        int count=0;
        boolean ans[]=new boolean[2048];
        boolean pair[]=new boolean[2048];
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
            pair[nums[i]^nums[j]]=true;
           }
        }
        for(int x=0;x<2048;x++){
            if(pair[x]!=true){
                continue;
            }
            for(int num:nums){
                ans[num^x]=true;
            }
        }
        for(boolean b:ans){
            if(b){
                count++;
            }
        }
        return count;
    }
}
