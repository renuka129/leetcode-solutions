class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long x=0;
        long rev=0;
        while(n!=0){
            x=n%10;
            sum+=x;
            if(x!=0){
            rev=rev*10+x;
            }
            n/=10;
        }
        long ans=0;

        while(rev!=0){
            ans=ans*10+rev%10;
            rev/=10;

        }
        return ans*sum;
    }
}