class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer>h1=new HashMap<>();
        HashMap<Character,Integer>h2=new HashMap<>();
        List<Integer>res=new ArrayList<>();
        int count=0;
        int i=0;int j=0;
        for(int f=0;f<p.length();f++){
            h2.put(p.charAt(f),h2.getOrDefault(p.charAt(f),0)+1);
        }
        while(j<s.length()){
            h1.put(s.charAt(j),h1.getOrDefault(s.charAt(j),0)+1);
            if(j-i+1==p.length()){
                if(h2.equals(h1)){
                res.add(i);
                }
                h1.put(s.charAt(i),h1.get(s.charAt(i))-1);
                if(h1.get(s.charAt(i))==0){
                    h1.remove(s.charAt(i));
                }
                i++;
            }
            j++;
            
        }
        return res;
    }
}