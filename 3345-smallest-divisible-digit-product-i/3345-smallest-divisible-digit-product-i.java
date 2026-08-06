class Solution {
    public int smallestNumber(int n, int t) {
        int mul=f(n);
        while(true){
            if(mul%t==0){
                return n;
            }
            else{
                n=n+1;
                mul=f(n);
            }
        }
    }
    int f(int n){
        int mul=1;
        while(n!=0){
            int temp=n%10;
            mul*=temp;
            n/=10;
        }
        return mul;
    }
}