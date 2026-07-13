class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int l=String.valueOf(low).length();
        int r=String.valueOf(high).length();
        List<Integer>l1=new ArrayList<>();
        String res="123456789";
        for(int i=l;i<=r;i++){
            for(int j=0;j+i<=9;j++){
                String s=res.substring(j,j+i);
                int n=Integer.parseInt(s);
                if(n>=low&&n<=high){
                l1.add(n);
                }
            }
        }
        return l1;
    }
}