class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        Arrays.sort(nums);
        f(0,nums,l,res);
        return res;
    }
        void f(int ind,int[] nums,List<Integer>l,List<List<Integer>>res){
            res.add(new ArrayList<>(l));
            for(int i=ind;i<nums.length;i++){
                if(i!=ind&&nums[i]==nums[i-1]){
                    continue;
                }
                l.add(nums[i]);
                f(i+1,nums,l,res);
                l.remove(l.size()-1);
            }
        }
        
    
}