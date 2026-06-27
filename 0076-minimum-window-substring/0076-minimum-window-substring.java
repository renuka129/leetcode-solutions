class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer>m=new HashMap<>();
        Map<Character,Integer>m1=new HashMap<>();
        int count=0;
        int min=Integer.MAX_VALUE;
        int i=0;
        int j=0;
        String ans="";
        for(int k=0;k<t.length();k++){
            m.put(t.charAt(k),m.getOrDefault(t.charAt(k),0)+1);
        }
        while(j<s.length()){
            m1.put(s.charAt(j),m1.getOrDefault(s.charAt(j),0)+1);
            if(m.containsKey(s.charAt(j))&&m1.get(s.charAt(j)) <= m.get(s.charAt(j))){
                count++;
            }
            while(count==t.length()){
                if((j-i+1)<min){
                    min=j-i+1;
                    ans=s.substring(i,j+1);
                }
                char left = s.charAt(i);
                m1.put(left, m1.get(left) - 1);
                if(m.containsKey(left) && m1.get(left) < m.get(left)){
                count--;
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}