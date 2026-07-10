class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>s1=new HashSet<>();
       int j=0;
       int i=0;
       int ans=0;
       while(j<s.length()){
        char c=s.charAt(j);
        if(!s1.contains(c)){
            s1.add(c);
            ans=Math.max((j-i)+1,ans);
            j++;
        }
        else{
            s1.remove(s.charAt(i));
            i++;
        }
       }
       return ans;
    }
}