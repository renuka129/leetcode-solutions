class Solution {
    public String smallestPalindrome(String s) {
        char middle='q';
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'a';
            freq[c]++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]%2==1){
            middle=(char)(i+'a');
            }
            freq[i]/=2;
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<26;i++){
            while(freq[i]!=0){
            res.append((char)(i+'a'));
            freq[i]--;
            }
        }
        StringBuilder temp = new StringBuilder(res);
        String r = temp.reverse().toString();
        String l=res.toString();
        String result="";
        if(s.length()%2==0){
            result=l+r;
        }
        else{
            result=l+middle+r;
        }
        return result;
    }
}