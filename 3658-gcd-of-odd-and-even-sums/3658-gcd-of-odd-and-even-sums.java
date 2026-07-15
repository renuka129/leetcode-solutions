class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd=n*n;
        int even=n*(n+1);
        return gcd(odd,even);
    }
    int gcd(int a ,int b){
        if(b==0){
            return a;
        }
       return gcd(b,a%b);
    }
}