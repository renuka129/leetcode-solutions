class Solution {
    public String smallestSubsequence(String s) {
        StringBuilder ans=new StringBuilder();
        int freq[]=new int[26];
        boolean vis[]=new boolean[26];
        for(int i=0;i<s.length();i++){
            int n=s.charAt(i)-'a';
            freq[n]++;
        }
        int j=0;
        Stack<Character>s1=new Stack<>();
        while(j<s.length()){
            char ch = s.charAt(j);
            freq[ch - 'a']--;
            if(vis[ch-'a']){j++;continue;}
        while(!s1.isEmpty()&&s1.peek()>ch&&freq[s1.peek()-'a']>0){
            char top=s1.pop();
            vis[top - 'a'] = false;
        }
        s1.push(s.charAt(j));
        vis[ch-'a']=true;
        j++;
        }
        while(!s1.isEmpty()){
            ans.append(s1.pop());
        }
        return ans.reverse().toString();
    }
}