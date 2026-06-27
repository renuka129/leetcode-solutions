class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        f(candidates,target,0,res,l);
        return res;   
    }
    void f(int nums[],int tar,int ind,List<List<Integer>>res,List<Integer>l){
        if(ind==nums.length){
            if(tar==0){
                res.add(new ArrayList<>(l));
            }
            return;
        }
        if(nums[ind]<=tar){
            l.add(nums[ind]);
            f(nums,tar-nums[ind],ind,res,l);
            l.remove(l.size()-1);
        }
        f(nums,tar,ind+1,res,l);
    }
}