class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        //Arrays.fill(ans,-1);
        Map<Integer,Integer>m=new HashMap<>();
        int j=0;
        Stack<Integer>s=new Stack<>();
        while(j<nums2.length){
            while(!s.isEmpty()&&s.peek()<nums2[j]){
               int n= s.pop();
                m.put(n,nums2[j]);
            }
            s.push(nums2[j]);
            j++;
        }
            while(!s.isEmpty()){
                m.put(s.pop(),-1);
            }
        int k=0;
        for(int i=0;i<nums1.length;i++){
            if(m.containsKey(nums1[i])){
                ans[k++]=m.get(nums1[i]);
            }
            else{
                ans[k++]=-1;
            }
        }
        return ans;
    }
}