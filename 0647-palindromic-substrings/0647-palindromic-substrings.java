class Solution {
    public int countSubstrings(String s) {
        int x=0;int y=0;
        int max=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            x=i;
            y=i;//odd length
            while(x>-1&&y<s.length()&&s.charAt(x)==s.charAt(y)){
                count++;
                x--;
                y++;  
            }
        }
        for(int i=0;i<s.length();i++){
            x=i;
            y=i+1;//even length
            while(x>-1&&y<s.length()&&s.charAt(x)==s.charAt(y)){
                count++;
                x--;
                y++;  
            }
        }
        return count;
    }
}