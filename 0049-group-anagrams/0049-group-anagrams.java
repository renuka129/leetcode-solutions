class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>>m=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char c[]=strs[i].toCharArray();
            Arrays.sort(c);
            String key=new String(c);
            if(!m.containsKey(key)){
                m.put(key,new ArrayList<>());
            }
            m.get(key).add(strs[i]);

        }
        return new ArrayList<>(m.values());
    }
}