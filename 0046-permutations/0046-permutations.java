class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>m=new HashMap<>();
        f(0,res,nums);
        return res;
        
    }
    // void f(int ind,int[] nums, List<Integer> l,List<List<Integer>>res,Map<Integer,Integer>m){
    //     if(l.size()==nums.length){
    //         res.add(new ArrayList<>(l));
    //         return;
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         if(!m.containsKey(nums[i])){
    //             l.add(nums[i]);
    //             m.put(nums[i],i);
    //             f(i,nums,l,res,m);
    //             m.remove(nums[i]);
    //             l.remove(l.size()-1);
    //         }
    //     }
    // }

    //without using extra space
    void f(int ind,List<List<Integer>>res,int nums[]){
        if(ind==nums.length){
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                l.add(nums[i]);
            }
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            f(ind+1,res,nums);
            swap(i,ind,nums);
        }
    }
    void swap(int i,int j,int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}