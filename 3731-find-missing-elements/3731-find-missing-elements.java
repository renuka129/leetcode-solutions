class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>l=new ArrayList<>();
         List<Integer>res=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=min;i<=max;i++){
            if(!l.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}