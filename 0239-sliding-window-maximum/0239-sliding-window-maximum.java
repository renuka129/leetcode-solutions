class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>q=new LinkedList<>();
        int j=0;
        int i=0;
        int ans[]=new int[nums.length-k+1];
        while(j<nums.length){
            while(!q.isEmpty()&&nums[j]>nums[q.peekLast()]){
                q.pollLast();
            }
            q.addLast(j);
            if(q.peekFirst()<=j-k){
                q.pollFirst();
            }
            if(j>=k-1){
                ans[i++]=nums[q.peekFirst()];
            }
            j++;
        }
        return ans;
        
    }
}