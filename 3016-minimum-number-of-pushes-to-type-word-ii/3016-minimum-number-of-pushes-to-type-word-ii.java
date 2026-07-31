class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer>m=new HashMap<>();
        int increment=1;
        int counter=2;
        int sum=0;
        for(int i=0;i<word.length();i++){
            m.put(word.charAt(i),m.getOrDefault(word.charAt(i),0)+1);
        }
        ArrayList<Map.Entry<Character,Integer>>l=new ArrayList<>(m.entrySet());
        Collections.sort(l,(a,b)->b.getValue()-a.getValue());
        for(Map.Entry<Character,Integer>m1:l){
            int freq=m1.getValue();
                int n=increment*freq;
                sum+=n;
                counter++;
            if(counter==10){
                counter=2;
                increment++;
            }
        }
        return sum;
    }
}