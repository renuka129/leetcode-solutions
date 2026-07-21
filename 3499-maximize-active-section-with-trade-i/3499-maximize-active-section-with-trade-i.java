class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        String t='1'+s+'1';
        int initialones=0;
        ArrayList<Character>l=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(c=='1'){
            initialones++;
            }
        }
        int max=initialones;
        int i1=0;
        while(i1<t.length()){
        int cnt=0;
        char ch=t.charAt(i1);
        while(i1<t.length()&&t.charAt(i1)==ch){
            i1++;
            cnt++;
        }
        l.add(ch);
        l1.add(cnt);
        }
        for(int i=1;i<l.size()-1;i++){
            if(l.get(i)=='1'&&l.get(i-1)=='0'&&l.get(i+1)=='0'){
                max=Math.max(l1.get(i-1)+l1.get(i+1)+initialones,max);
            }
        }
        return max;
    }
}