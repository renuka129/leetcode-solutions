class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1){
            return s;
        }
        String max="";
        //odd length
        for(int i=0;i<s.length();i++){
            int x=i;
            int y=i;
            while(x>=0&&y<s.length()&&s.charAt(x)==s.charAt(y)){
                x--;
                y++;
                if(x==-1&&y==s.length()){
                    break;
                }
            }
            String pal=s.substring(x+1,y);
            if(max.length()<pal.length()){
                max=pal;
            
            }
        }
        //even length
        for(int i=0;i<s.length();i++){
            int x=i;
            int y=i+1;
            while(x>=0&&y<s.length()&&s.charAt(x)==s.charAt(y)){
                x--;
                y++;
                if(x<0&&y>s.length()){
                    break;
                }
            }
            String pal=s.substring(x+1,y);
            if(max.length()<pal.length()){
                max=pal;
            }
        }

        return max;
    }
}