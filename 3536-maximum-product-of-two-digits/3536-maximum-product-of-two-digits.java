class Solution {
    public int maxProduct(int n) {
        // int ans=1;
        // ArrayList<Integer>l=new ArrayList<>();
        // while(n!=0){
        //     int q=n%10;
        //     l.add(q);
        //     n/=10;
        // }
        // Collections.sort(l);
        // return l.get(l.size()-1)*l.get(l.size()-2);

        int max1=0;int max2=0;
        while(n!=0){
            int q=n%10;
            if(max1<=q){
                max2=max1;
                max1=q;
            }
            else if(max2<q){
                max2=q;
            }
            n/=10;
        }
        return max1*max2;
    }
}