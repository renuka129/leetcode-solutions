class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>>res=new HashSet<>();
        f(0,nums,res);
        return new ArrayList<>(res);
        
    }
    void f(int ind,int nums[],Set<List<Integer>>res){
        if( ind==nums.length){
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                l.add(nums[i]);
            }
            res.add(new ArrayList<>(l));
            return ;
        }
        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            f(ind+1,nums,res);
            swap(i,ind,nums);
        }
    }
    void swap(int i,int j,int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}