class Solution {
    public int maxProduct(int n) {
        int ans=1;
        ArrayList<Integer>l=new ArrayList<>();
        while(n!=0){
            int q=n%10;
            l.add(q);
            n/=10;
        }
        Collections.sort(l);
        return l.get(l.size()-1)*l.get(l.size()-2);
    }
}