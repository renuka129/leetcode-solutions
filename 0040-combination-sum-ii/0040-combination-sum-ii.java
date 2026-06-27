class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        f(target,candidates,0,res,l);
        return res;
    }
    void f(int tar,int[]nums,int ind,List<List<Integer>>res,List<Integer>l){
        if(tar==0){
            res.add(new ArrayList<>(l));
            return;
            
        }
        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]<=tar){
                l.add(nums[i]);
                f(tar-nums[i],nums,i+1,res,l);
                l.remove(l.size()-1);
            }
        }
        
    }
}