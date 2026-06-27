class Solution {
    public int maxArea(int[] height) {
        int ans=0;
        int i=0;
        int j=height.length-1;
        boolean f=false;
        while(i<j){
        int min=0;
            if(height[i]<=height[j]){
                f=true;
                min=i;
            }
            else{
                min=j;
                f=false;
            }
            ans=Math.max((j-i)*height[min],ans);
            if(f){
                i++;
            }
            if(!f){
                j--;
            }
        }
        return ans;
    }
}