class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%k!=0){
            return false;
        }
        int tar=sum/k;
        boolean vis[]=new boolean[nums.length];
        return f(0,k,tar,0,vis,nums);
        
    }

    boolean f(int ind,int subsets,int tar,int csum,boolean vis[],int nums[]){
        if(subsets==1){
            return true;
        }
        for(int i=ind;i<nums.length;i++){
            if(vis[i]==true){
                continue;
            }
            if(csum+nums[i]>tar){
                continue;
            }
            vis[i]=true;
            int newsum=csum+nums[i];
            if(newsum==tar){
                if(f(0,subsets-1,tar,0,vis,nums)){
                    return true;
                }
            }
            else{
                if(f(i+1,subsets,tar,newsum,vis,nums)){
                    return true;
                }
            }
            
            vis[i]=false;
        }
        return false;
    }
}