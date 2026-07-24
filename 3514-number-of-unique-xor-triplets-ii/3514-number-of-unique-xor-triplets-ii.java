class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer>s=new HashSet<>();
        Set<Integer>pair=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                pair.add(nums[i]^nums[j]);
            }
        }
        for(int i:pair){
            for(int j=0;j<nums.length;j++){
                s.add(nums[j]^i);
            }
        }
        return s.size();
    }
}
