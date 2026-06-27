class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f=first(nums,target);
        int l=last(nums,target);
        return new int[]{f,l};
        
    }

    int first(int arr[],int tar){
        int ans=-1;
        int l=0;int r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==tar){
                ans=m;
                r=m-1;
            }
            else if(arr[m]<tar){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return ans;
    }
    
    int last(int arr[],int tar){
        int ans=-1;
        int l=0;int r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==tar){
                ans=m;
                l=m+1;
            }
            else if(arr[m]<tar){
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return ans;
    }
}