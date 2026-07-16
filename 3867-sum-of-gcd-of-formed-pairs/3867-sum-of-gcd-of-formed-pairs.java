class Solution {
    public long gcdSum(int[] nums) {
        long prefixgcd[]=new long[nums.length];
        long max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            prefixgcd[i]=gcd(max,nums[i]);
        }
        Arrays.sort(prefixgcd);
        int i=0;int j=prefixgcd.length-1;
        long sum=0;
        while(i<j){
            sum+=gcd(prefixgcd[i],prefixgcd[j]);
            i++;
            j--;
        }
        return sum;
    }
    long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}